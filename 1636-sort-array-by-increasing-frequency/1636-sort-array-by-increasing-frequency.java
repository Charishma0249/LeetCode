class Solution {
    public int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(Pair p1, Pair p2){
                
                if(p1.freq>p2.freq)
                    return 1;
                else if(p1.freq<p2.freq)
                    return -1;
                else{
                    if(p2.id>p1.id)
                        return 1;
                    else if(p2.id<p1.id)
                        return -1;
                    return 0;
                }
            }
        });
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int count =0;
            
            if(hm.containsKey(nums[i]))
                count = hm.get(nums[i]);
            hm.put(nums[i], count+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        // res = new int[pq.size()];
        int k=-1;
        
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            
            for(int i=0; i<p.freq; i++)
                res[++k] = p.id;
        }
        
        return res;
    }
}

class Pair{
    int id;
    int freq;
    
    public Pair(){}
    
    public Pair(int id, int freq){
        this.id = id;
        this.freq = freq;
    }
}