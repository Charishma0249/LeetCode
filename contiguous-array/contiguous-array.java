class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length, res = Integer.MIN_VALUE, sum=0;
        for(int i=0; i<len; i++) {
            if(nums[i]==0)
                nums[i]=-1;
        }
        
        for(int i=0; i<len; i++) {
            
            sum += nums[i];
            
            if(sum == 0)
                res = i+1;
            if(hm.containsKey(sum))
                res = Math.max(res, i-hm.get(sum));
            
            else {
                hm.put(sum, i);
            }
        }
        
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}