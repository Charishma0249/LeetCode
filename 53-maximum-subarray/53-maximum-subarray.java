class Solution {
    public int maxSubArray(int[] nums) {
     
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            curSum = Math.max(nums[i], curSum+nums[i]);
            
            maxSum = Math.max(maxSum, curSum);
        }
        
        return maxSum;
    }
}