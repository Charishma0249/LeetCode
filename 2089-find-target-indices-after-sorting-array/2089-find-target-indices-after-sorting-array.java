class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(target == nums[i])
                al.add(i);
        }
        
        return al;
    }
}