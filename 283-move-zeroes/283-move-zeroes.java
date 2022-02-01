class Solution {
    public void moveZeroes(int[] nums) {
        
        int len = nums.length;
        for(int i=0, j=i+1; i<len-1 && j<len; ) {
            
            while(nums[i]==0 && j<len && nums[j]==0) {
                    j++;
            }
            if(nums[i] == 0 && j<len && nums[j]!=0) {
                // swap(nums, i, j);
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        } 
        
    }
    
//     public void swap(int[] nums, int i, int j) {
        
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
}

// 0,1,0,3,12
