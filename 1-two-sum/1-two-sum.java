class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i]))
                return new int[]{hm.get(nums[i]), i};
            hm.put(target-nums[i], i);
        }
        
        return new int[]{0,0};
    }
}