class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        
       // ArrayList<Long> ll = new ArrayList<>();
        HashMap<Long, Integer> hm = new HashMap<>();
        
        int res = Integer.MIN_VALUE;
        long sum=0;
        
        for(int i=0; i<nums.length; i++) {
            
            sum += nums[i];
            long diff = sum-(long)k;
            
            if(sum==k)
                res = i+1;
            else {
                
                if(hm.containsKey(diff)) {
                   // int j = ll.indexOf(diff);
                    int j = hm.get(diff);
                    res = Math.max(res, i-j);
                }
                
            }
            
            if(!hm.containsKey(sum))
                hm.put(sum, i);
        }
        
        return res==Integer.MIN_VALUE ? 0 : res;
    }
}