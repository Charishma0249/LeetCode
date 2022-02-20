class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int[] even = new int[len/2];
        int[] odd = new int[len/2];
        int k=-1, l=-1;
        
        for(int i=0; i<len; i++){
            if(nums[i]%2==0)
                even[++k]=nums[i];
            else
                odd[++l]=nums[i];
        }
        
        k=-1; l=-1;
        for(int i=0; i<len; i++){
            if(i%2==0)
                nums[i]=even[++k];
            else
                nums[i]=odd[++l];
        }
        
        return nums;
    }
}