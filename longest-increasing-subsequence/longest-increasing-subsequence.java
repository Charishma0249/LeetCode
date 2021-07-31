class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int len = nums.length, max = Integer.MIN_VALUE;
        int[] temp = new int[len];
        
        Arrays.fill(temp, 1);
        
        for(int i=1; i<len; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                    temp[i]=Math.max(temp[i], temp[j]+1);
                    
                    max = Math.max(max, temp[i]);
                }
            }
        }
        
        return Math.max(max, temp[len-1]);
    }
}