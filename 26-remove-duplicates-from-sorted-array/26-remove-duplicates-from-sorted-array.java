class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        if(len == 1)
            return len;
        
        int i=0, j=1;
        for(i=0, j= 1; i<j && j<len; ) {
            
            while(j<len && nums[i]==nums[j]) {
                j++;
            }
            
            if(j<len && nums[i]!=nums[j]) {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        
        return i+1;
    }
}


// 0, 0, 1, 1, 2
// 0, 1, 2, 3, 4
    
