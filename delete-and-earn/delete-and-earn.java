class Solution {
    public int deleteAndEarn(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length;
        
        int[] res = new int[nums[len-1]+1];
        
        int sum = nums[0];
        int alSize;
        
        for(int i=0; i<len; i++) {
            
            res[nums[i]] = res[nums[i]]+nums[i];
        }
        
        if(len==1)
            return res[nums[0]];
        
        res[2] = Math.max(res[1], res[2]);
        for(int i=3; i<=nums[len-1]; i++) {
            
            res[i] = Math.max(res[i-2]+res[i], res[i-1]);
        }
        
        return res[nums[len-1]];
    }
}