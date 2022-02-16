class Solution {
    int[] arr;
    public boolean canJump(int[] nums) {
        
        arr = new int[nums.length+1];
        
        if(nums.length==1)
            return true;
        return dp(nums,0);
    }
    
    public boolean dp(int[] nums, int i){
        
        // boolean res=false;
        if(i>=nums.length)
            return true;
        
        if(arr[i]==1)
            return true;
        else if(arr[i]==-1)
            return false;
        if(nums.length-i-1<=nums[i]){
            arr[i] = 1;
            return true;
        }
        
        for(int j=nums[i]; j>0; j--){
            boolean res = dp(nums, i+j);
            if(res) {
                return res;
            }
        }
        
        arr[i]=-1;
        return false;
    }
}