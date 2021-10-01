class Solution {
    public int findPeakElement(int[] nums) {
        
        int len = nums.length;
        
        if(len==1)
            return 0;
        
       int n = nums[0]; 
       for(int i=1; i+1<len; i++) {
           
           if(nums[i]>n && nums[i]>nums[i+1])
               return i;
           n = nums[i];
       }
        
       if(nums[len-1]>n) 
           return len-1;
        if(n>nums[len-1])
            return 0;
        return 0;
    }
    
    
}