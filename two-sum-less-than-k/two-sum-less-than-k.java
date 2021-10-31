class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        
        int len = nums.length, max=0, sum;
        Arrays.sort(nums);
        
        for(int i=0, j=len-1; i<j; ) {
            
            sum = nums[i]+nums[j];
            
            if(sum<k) {
                if(max<sum)
                    max=sum;
                i++;
            }
            else
                j--;
        }
        
        return (max==0)? -1 : max;
    }
}