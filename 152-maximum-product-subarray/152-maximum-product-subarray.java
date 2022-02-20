class Solution {
    public int maxProduct(int[] nums) {
        
        int prod1, prod2, max=1, min=1, res = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            
            prod1 = max*nums[i];
            prod2 = min*nums[i];
            
            max = Math.max(Math.max(prod1, prod2), nums[i]);
            min = Math.min(Math.min(prod1, prod2), nums[i]);
            
            res = Math.max(res, max);
        }
        
        return res;
    }
}