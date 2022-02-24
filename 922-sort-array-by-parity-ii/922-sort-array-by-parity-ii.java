class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int len = nums.length;
        int k=-1, l=-1;
        int[] res = new int[len];
        
        for(int i=0, j=0; i<len; i++){
            
            if(i%2==0 && nums[i]%2!=0){
                j = i+1;
                while(j<len && nums[j]%2!=0)
                    j++;
                if(j<len && nums[j]%2==0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            else if(i%2!=0 && nums[i]%2==0){
                j = i+1;
                while(j<len && nums[j]%2==0)
                    j++;
                if(j<len && nums[j]%2!=0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        
        return nums;
    }
}