class Solution {
    public String frequencySort(String s) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            
            @Override
            public int compare(Pair p1, Pair p2) {
                
                if(p2.frequency>p1.frequency)
                    return 1;
                else
                    return -1;
            }
        });
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int count;
        
        for(char c : s.toCharArray()) {
            
            count = 1;
            if(hm.containsKey(c))
                count += hm.get(c);
            
            hm.put(c, count);
        }
        
        StringBuilder sb = new StringBuilder("");
        
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        
        while(!pq.isEmpty()) {
            
            Pair p = pq.poll();
            int frequency = p.frequency;
            
            while(frequency>0) {
                sb.append(p.c);
                frequency--;
            }
                
        }
        
        return sb.toString();
    }
    
}

class Pair {
    
    char c;
    int frequency;
    
    public Pair(char c, int frequency) {
        this.c = c;
        this.frequency = frequency;
    }
}