class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int len = nums.length;
        int maxCounter=0, idx=-1, counter=0;
        int i=0,j=0;
        
        for(i=0, j=0; i<=j && j<len; j++) {
            
            if(nums[j]==0) {
                if(counter==0) {
                    counter++;
                    idx = j;
                }
                else {
                    maxCounter = Math.max(maxCounter, j-i);
                    i = idx+1;
                    idx = j;
                    // counter=0;
                }
            }
        }
        
        return Math.max(maxCounter, j-i);
    }
}