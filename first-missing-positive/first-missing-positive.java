class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int small = Integer.MAX_VALUE;
        int big = 0;
        int len = nums.length, i=0; 
        
        for(i=0;i<len;)
        {
           while(nums[i]>0 && nums[i]<len && nums[i]!=i+1 && nums[nums[i]-1]!=nums[i])
           {
               int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
               nums[i] = temp;
           }
            i++;
        }
        
        for(i=0;i<len;i++)
        {
            if(nums[i]!=i+1)
                break;
        }
        
        // if(i==len)
        //     return len+1;
        
        return i+1;
    }
}