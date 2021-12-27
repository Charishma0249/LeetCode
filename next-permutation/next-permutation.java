class Solution {
    public void nextPermutation(int[] nums) {
        
        int maxIndex=0, max=nums[0], min;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]>nums[i-1]) {
                
                maxIndex = i;
            }
        }
        
        if(maxIndex==0) {
            Arrays.sort(nums);
            return ;
        }
        
        int nextMax=maxIndex-1;
        for(int i=maxIndex; i<nums.length; i++) {
            if(nums[i]>nums[maxIndex-1] && nums[i]<nums[maxIndex]) {
                nextMax = i;
            }
        }
         //System.out.println("nextMax = "+nextMax+" maxIndex = "+maxIndex);
        
        if(nextMax==maxIndex-1) {
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[nextMax];
            nums[nextMax] = temp;
            Arrays.sort(nums, maxIndex, nums.length);
        }
        else {
            //System.out.println("nextMax = "+nextMax+" maxIndex = "+maxIndex);
            int temp = nums[maxIndex-1];
            nums[maxIndex-1] = nums[nextMax];
            nums[nextMax] = temp;
            Arrays.sort(nums, maxIndex, nums.length);
            //Arrays.sort
        }
    }
}