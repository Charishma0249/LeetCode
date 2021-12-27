class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //O(1) space complexity and O(n) time complexity
        int len = nums.length;
        int[] res = new int[len];
        
        res[len-1] = nums[len-1];
        for(int i=len-2; i>=0; i--) {
            res[i] = res[i+1]*nums[i];
        }
        
        int prod = 1;
        for(int i=0; i<len-1; i++) {
            res[i] = prod*res[i+1];
            prod = prod*nums[i];
        }
        res[len-1] = prod;
        return res;
    }
}