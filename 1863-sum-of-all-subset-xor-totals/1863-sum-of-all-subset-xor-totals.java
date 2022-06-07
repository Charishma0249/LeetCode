class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        int[] arr = new int[nums.length+1];
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        
        // System.out.println("Hi - "+(6^1^1));
        rec(nums, 0, 0);
        // System.out.println(subsets);
        return sum;
    }
    
    public void rec(int[] nums, int j, int val) {
        int xor=0;
        
        for(int i=j; i<nums.length; i++) {
            val = val^nums[i];
            rec(nums, i+1, val);
            sum += val;
            val = val^nums[i];
            
        }
    }
}