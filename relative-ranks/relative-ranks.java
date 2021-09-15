class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Integer> scoresPriority = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, String> hm = new HashMap<>();
        int len = score.length;
        
        String[] res;
        
        for(int n : score)
            scoresPriority.add(n);
        
        res = new String[len];
        
        for(int i=0; i<len; i++) {
            
            int n = scoresPriority.poll();
            
            if(i==0)
                hm.put(n, "Gold Medal");
            else if(i==1)
                hm.put(n, "Silver Medal");
            else if(i==2)
                hm.put(n, "Bronze Medal");
            else
                hm.put(n, String.valueOf(i+1));
            
        }
        
        for(int i=0; i<len; i++)
            res[i] = hm.get(score[i]);
        
        return res;
            
        
    }
}