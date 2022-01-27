class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        ArrayList<String> al = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p2.count>p1.count) {
                    return 1;
                }
                else if(p2.count<p1.count)
                    return -1;
                else{
                    if(p2.s.compareTo(p1.s)<0)
                        return 1;
                    else if(p2.s.compareTo(p1.s)>0)
                        return -1;
                    return 0;
                }
            }
        });
        
        for(String s: words) {
            int count = 0;
            
            if(hm.containsKey(s))
                count = hm.get(s);
            
            count++;
            hm.put(s, count);
        }
        
        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        
        int i=0;
        while(i<k) {
            Pair p = pq.poll();
            // System.out.println(p.s +" "+ p.count);
            // if(al.size()>0)
            //     System.out.println(p.s.compareTo(al.get(0)));
            al.add(p.s);
            i++;
        }
        
        return al;
    }
    
    
}

class Pair{
    String s;
    int count;
    
    public Pair(String s, int count) {
        this.s = s;
        this.count = count;
    }
}