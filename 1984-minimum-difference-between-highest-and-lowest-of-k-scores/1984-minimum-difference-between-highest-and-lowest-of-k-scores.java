class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        
        for(int i=0, j= i+k-1; j<nums.length; i++, j++){
            
            int diff = nums[j]-nums[i];
            
            min = Math.min(diff, min);
            // i = i+k;
        }
        
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}