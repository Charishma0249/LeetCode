class Solution {
    public void sortColors(int[] nums) {
        
        int len = nums.length;
        int j=0, temp=0;
        for(int i=1; i<len; i++) {
            
            while(j<len && nums[j]==0)
                j++;
            
            if(j<i && nums[i]==0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
                j++;
            }
                
        }
        
        j=len-1;
        temp=0;
        
        for(int i=len-1; i>=0; i--) {
            
            while(j>=0 && nums[j]==2)
                j--;
            
            if(j>i && nums[i]==2) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
        }
    }
}