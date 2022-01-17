class Solution {
    public int minMoves(int[] nums) {
        
        int min = nums[0];
        int moves = 0, sum=nums[0];
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i]<min)
                min = nums[i];
            sum+=nums[i];
        }
        
        moves = sum-(nums.length)*min;
        
        return moves;
    }
}