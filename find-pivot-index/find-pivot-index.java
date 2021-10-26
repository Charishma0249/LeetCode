class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum=0, lsum=0, rsum=0, len = nums.length;
        
        for(int i=0; i<len; i++) 
            sum += nums[i];
        
        rsum = sum;
        for(int i=0; i<len; i++) {
            
            rsum -= nums[i];
            if(lsum==rsum)
                return i;
        
            lsum += nums[i];
        }
        
        return -1;
    }
}