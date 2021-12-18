class Solution {
    public int maxSubArray(int[] nums) {
        
        int len = nums.length, sum=nums[0], curSum=nums[0];
        for(int i=1; i<len; i++) {
            
            curSum = Math.max(nums[i]+curSum, nums[i]);
            sum = Math.max(sum, curSum);
            
        }
        
        //return sum == Integer.MIN_VALUE ? nums[0] : sum;
        return sum;
    }
}