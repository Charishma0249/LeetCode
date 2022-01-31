class Solution {
    public int minMoves2(int[] nums) {
        
        int moves =0;
        int avg =0, mid = nums.length/2;
       
        Arrays.sort(nums);
        if(nums.length%2==0)
            avg = (nums[mid-1]+nums[mid])/2;
        else
            avg = nums[mid];
        
         // System.out.println(avg);
        for(int i=0; i<nums.length; i++) {
            moves += Math.abs(nums[i]-avg);
        }
        
        return moves;
    }
}