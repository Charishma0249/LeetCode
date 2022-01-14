class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=nums[0], curSum=nums[0];
        
        for(int i=1; i<nums.length; i++) {
            
            curSum = Math.max(nums[i], curSum+nums[i]);
            sum = Math.max(sum, curSum);
            
        }
        
        return sum;
    }
}

// (sum+nums[i], sum)
// sum, nums[i]