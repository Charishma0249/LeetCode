class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int len = nums.length, i=0, j=0, n=-1, m=-1;
        int maxCounter = 0, counter=0;
        int[] idx = new int[len];
        
        for(i=0, j=0; i<=j && j<len; j++) {
            
            if(nums[j]==0) {
                idx[++n] = j;
                if(counter<k) {
                    counter++;
                }
                else{
                    maxCounter = Math.max(maxCounter, j-i);
                    i = idx[++m]+1;
                }
            }
        }
        return Math.max(maxCounter, j-i);
    }
}