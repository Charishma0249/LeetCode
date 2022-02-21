class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = nums.length;
        
        for(int i=0; i<len; i++){
            
            int count =0;
            if(hm.containsKey(nums[i]))
                count = hm.get(nums[i]);
            
            hm.put(nums[i], count+1);
        }
        
        int maxCount = len/2;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            
            if(entry.getValue()>maxCount)
                return entry.getKey();
        }
        
        return 0;
    }
}