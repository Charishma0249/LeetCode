class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        int[] arr = new int[nums.length+1];
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        
        // System.out.println("Hi - "+(6^1^1));
        rec(nums, 0, new ArrayList<Integer>(), 0, subsets);
        // System.out.println(subsets);
        return sum;
    }
    
    public void rec(int[] nums, int j, ArrayList<Integer> arr, int val, ArrayList<ArrayList<Integer>> subsets) {
        
        int xor=0;
        // if(j==nums.length-1) 
        //     return nums[j];
        // if(subsets.contains(new ArrayList<>(arr))) {
        //     return ;
        // }
        // if(j<nums.length) {
        //     val = val^nums[j];
        //     sum += val;
        //     // sum += nums[j];
        //     // subsets.add(new ArrayList<>(arr));
        //     System.out.println(val);
        // }
        // if(j==nums.length) {
        //     return nums[j-1];
        // }
        for(int i=j; i<nums.length; i++) {
            // arr.add(nums[i]);
            val = val^nums[i];
             // System.out.println(val);
            rec(nums, i+1, arr, val, subsets);
            // rec(nums, i+1, arr, 0, subsets);
            // if(!subsets.contains(new ArrayList<>(arr)))
            //     subsets.add(new ArrayList<>(arr));
            // subsets.add(new ArrayList<>(arr));
            sum += val;
            // arr.remove(arr.size()-1);
            val = val^nums[i];
            
        }
        
        // return xor;
    }
}