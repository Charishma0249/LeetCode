class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k==0)
            return 0;
        
        long prod =1;
        int len = nums.length, count =0;
        
        for(int i=0, j=0; i<len && j<len; j++) {
            
            prod = prod*nums[j];
            
            while(prod >= k && i<j) {
                prod = prod/nums[i];
                i++;
               // count++;
            }
            
            if(prod<k)
                count += j-i+1;
        }
        
        return count;
    }
}