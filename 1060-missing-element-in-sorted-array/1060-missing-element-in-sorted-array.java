class Solution {
    public int missingElement(int[] nums, int k) {
        
        for(int i=0; i<nums.length-1; i++){
            int diff = nums[i+1]-nums[i]-1;
            
            if(diff>=k)
                return nums[i]+k;
            k -= diff;
        }
        
        
        return nums[nums.length-1]+k;
    }
}