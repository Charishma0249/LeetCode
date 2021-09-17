class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>( new Comparator<Pair>() {
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p2.count > p1.count)
                    return 1;
                else
                    return -1;
            }
        });
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count;
        
        for(int n: nums) {
            
            count = 1;
            
            if(hm.containsKey(n))
                count += hm.get(n);
            
            hm.put(n, count);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        
        int[] res = new int[k];
        int i=-1;
        
        while(i<k-1) {
            res[++i] = pq.poll().n;
        }
        
        return res;
    }
}

class Pair {
    
    int n;
    int count;
    
    public Pair(int n, int count) {
        this.n = n;
        this.count = count;
    }
}