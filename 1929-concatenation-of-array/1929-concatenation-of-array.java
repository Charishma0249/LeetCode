class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int[] res = new int[2*len];
        
        for(int j=0, k=-1; j<len; j++) {
            
            res[++k] = nums[j];
            res[len+k] = nums[j];
        }
        
        
        return res;
    }
}