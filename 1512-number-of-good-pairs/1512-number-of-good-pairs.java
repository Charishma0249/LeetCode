class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res=0;
        for(int i=0; i<nums.length; i++) {
            int count =0;
            if(hm.containsKey(nums[i]))
                count = hm.get(nums[i]);
            hm.put(nums[i], count+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int val = entry.getValue();
            if(val==1)
                continue;
            int fact=0;
            if(val%2==0)
                fact = (val/2)*(val-1);
            else
                fact = val*((val-1)/2);
            
            res += fact;
        }
        return res;
    }
}