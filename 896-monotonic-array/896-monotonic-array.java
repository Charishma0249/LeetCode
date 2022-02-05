class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        int sl=0, si=0;
        if(len==1)
            return true;
        
        for(int i=0; i<len-1;i++){
            if(nums[i]>=nums[i+1])
                sl++;
            if(nums[i]<=nums[i+1])
                si++;
        }
        
        if(sl==len-1 || si==len-1)
            return true;
        
        return false;
    }
}