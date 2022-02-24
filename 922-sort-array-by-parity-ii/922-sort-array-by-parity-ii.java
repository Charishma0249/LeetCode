class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        
        for(int i=0, j=0; i<len; i++){
            
            if(i%2==0 && nums[i]%2!=0){
                j=i+1;
                while(j<len && nums[j]%2!=0)
                    j = j+2;
                if(j<len){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
            else if(i%2!=0 && nums[i]%2==0){
                j = i+1;
                while(j<len && nums[j]%2==0)
                    j = j+2;
                if(j<len){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        
        return nums;
    }
}