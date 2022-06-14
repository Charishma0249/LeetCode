class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = new int[2*len];
        
        for(int i=0, j=len; i<len; i++, j++) {
            res[i] = nums[i];
            res[j] = nums[i];
        }
        
        return res;
    }
}