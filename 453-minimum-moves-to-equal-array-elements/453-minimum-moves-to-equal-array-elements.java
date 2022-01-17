class Solution {
    public int minMoves(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int moves = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<min)
                min = nums[i];
        }
        
        for(int i=0; i<nums.length; i++) {
            moves += Math.abs(nums[i]-min);
        }
        
        return moves;
    }
}