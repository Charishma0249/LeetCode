class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int len = nums.length;
        int[] result = new int[len];
        
        for(int i=0, j=n, k=0; j<len; i++,j++) {
            result[k] = nums[i];
            result[++k] = nums[j];
            k++;
        }
        
        return result;
    }
}