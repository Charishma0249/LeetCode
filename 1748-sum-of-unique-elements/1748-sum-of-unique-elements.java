class Solution {
    public int sumOfUnique(int[] nums) {
        int res =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length;i++) {
            int count =0;
            if(hm.containsKey(nums[i]))
                count = hm.get(nums[i]);
            hm.put(nums[i], count+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()==1)
                res += entry.getKey();
        }
        
        return res;
    }
}