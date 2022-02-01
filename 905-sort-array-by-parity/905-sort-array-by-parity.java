class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int len = nums.length;
        for(int i=0, j=i+1; i<len-1; ) {
            
            while(nums[i]%2!=0 && j<len && nums[j]%2!=0) {
                j++;
            }
            if(j<len && nums[i]%2!=0 && nums[j]%2 ==0) {
                swap(nums, i, j);
                i++;
                j++;
            }
            else {
                i++;
                j++;
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