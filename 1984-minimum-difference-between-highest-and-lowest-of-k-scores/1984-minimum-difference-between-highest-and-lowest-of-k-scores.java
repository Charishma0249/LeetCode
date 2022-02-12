class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i+k-1<nums.length; i++){
            
            int diff = nums[i+k-1]-nums[i];
            
            min = Math.min(diff, min);
            // i = i+k;
        }
        
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}