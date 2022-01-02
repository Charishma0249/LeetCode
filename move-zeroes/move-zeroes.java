class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i= nums.length-1, j=i-1; j<i && j>=0; i--, j--) {
            
            if(nums[j]==0) {
                int k =i;
                int l=j;
                while(k<nums.length && nums[k]!=0) {
                    nums[l] = nums[k];
                    nums[k]=0;
                    k++;
                    l++;
                }
            }
            
        }
    }
}