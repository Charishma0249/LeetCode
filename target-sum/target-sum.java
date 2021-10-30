class Solution {
    
    int len, count=0;
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        len = nums.length;
        rec(nums, target, 0, sum);
        return count;
    }
    
    public void rec(int[] nums, int target, int i, int sum) {
        
        //System.out.println("i = "+i + " = " +sum);
        if(sum==target && i==len) {
            
            count++;
        }
        
        if(i>=len)
            return ;
        
        rec(nums, target, i+1, sum+nums[i]);
        rec(nums, target, i+1, sum-nums[i]);
    }
}