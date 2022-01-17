class Solution {
    public int minMoves(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int moves = 0, sum=0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<min)
                min = nums[i];
            sum+=nums[i];
        }
        
        moves = sum-(nums.length)*min;
        
        return moves;
    }
}