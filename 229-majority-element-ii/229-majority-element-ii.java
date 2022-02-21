class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int len = nums.length, max = len/3;
        List<Integer> res = new ArrayList<>();
        
        for(int i=0; i<len; i++){
            int count=0;
            
            if(hm.containsKey(nums[i]))
                count = hm.get(nums[i]);
            
            hm.put(nums[i], count+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            
            if(entry.getValue()>max)
                res.add(entry.getKey());
        }
        
        return res;
    }
}