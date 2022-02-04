class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int[] res = new int[2*len];
        
        int k=-1;
        for(int j=0; j<len; j++) {
            k++;
            res[k] = nums[j];
            res[len+k] = nums[j];
        }
        
        
        return res;
    }
}