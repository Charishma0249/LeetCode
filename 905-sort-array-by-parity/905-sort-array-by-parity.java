class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int len = nums.length;
        for(int i=0, j=len-1; i<j; ) {
            
            while(nums[i]%2!=0 && j>=0 && nums[j]%2!=0) {
                j--;
            }
            while(i<len-1 && nums[i]%2==0 && nums[j]%2==0) {
                i++;
            }
            if(i<j && j>=0 && nums[j]%2==0 && nums[i]%2!=0) {
                swap(nums, i, j);
                i++;
                j--;
            }
            else {
                // System.out.println("nums[i] "+nums[i]+" nums[j] "+nums[j]);
                i++;
                j--;
                
            }
            
        }
        
        return nums;
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}