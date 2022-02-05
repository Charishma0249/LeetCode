class Solution {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        boolean sl=true, si=true;
        if(len==1)
            return true;
        
        for(int i=0; i<len-1;i++){
            
            sl = sl && (nums[i]>=nums[i+1]);
            
            si = si && (nums[i]<=nums[i+1]);
        }
        
//         if(sl==len-1 || si==len-1)
//             return true;
        
//         return false;
        return sl || si;
    }
}