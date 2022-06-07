class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        findSubsets(nums, result, new ArrayList<>(), 0);
        result.add(new ArrayList<>());
        return result;
    }
    
    public void findSubsets(int[] nums, List<List<Integer>> result, ArrayList<Integer> subset, int j) {
        
        
        if(result.contains(subset)) {
            return ;
        }
        
        for(int i=j; i<nums.length; i++) {
            subset.add(nums[i]);
            ArrayList<Integer> al = new ArrayList<>(subset);
            findSubsets(nums, result, al, i+1);
            
            result.add(al);
            subset.remove(subset.size()-1);
        }
    }
}