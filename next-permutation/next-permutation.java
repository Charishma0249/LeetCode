class Solution {
    public void nextPermutation(int[] nums) {
        
        int maxIndex=0;
        for(int i=nums.length-1; i>0; i--) {
            if(nums[i]>nums[i-1]) {
                
                maxIndex = i;
                break;
            }
        }
        //System.out.println(maxIndex);
        if(maxIndex==0) {
            for(int i=0, j=nums.length-1; i<j; i++,j--) {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            return ;
        }
        
        int nextMax=maxIndex-1;
        for(int i=maxIndex; i<nums.length; i++) {
            if(nums[i]>nums[maxIndex-1] && nums[i]<nums[maxIndex]) {
                nextMax = i;
            }
        }
        
        if(nextMax==maxIndex-1) {
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[nextMax];
            nums[nextMax] = temp;
        }
        else {
            int temp = nums[maxIndex-1];
            nums[maxIndex-1] = nums[nextMax];
            nums[nextMax] = temp;
        }
        
        Arrays.sort(nums, maxIndex, nums.length);
    }
}