class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        // Arrays.sort(nums);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        int[] temp = new int[len];
        int[] res = new int[len];
        for(int i=0; i<len; i++) {
            temp[i] = nums[i];
        }
        
        Arrays.sort(temp);
        for(int i=0; i<len; i++) {
            if(!hm.containsKey(temp[i]))
                hm.put(temp[i], i);
        }
        for(int i=0; i<len; i++) {
            res[i] = hm.get(nums[i]);
        }
        
        return res;
    }
}