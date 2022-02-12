class Solution {
    public int[] distinctNumbers(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[nums.length-k+1];
        
        for(int i=0; i<k; i++){
            // hs.add(nums[i]);
            int count = 0;
            if(hm.containsKey(nums[i]))
                count = hm.get(nums[i]);
            
            hm.put(nums[i], count+1);
        }
        
        res[0] = hm.size();
        for(int i=1, j=i+k-1; j<nums.length; i++, j++){
            if(nums[i-1]==nums[j])
                res[i] = hm.size();
            else{
                // System.out.println("nums[i] = "+nums[i-1]+" nums[j] = "+nums[j]);
                int count=0;
                if(hm.get(nums[i-1])==1)
                    hm.remove(nums[i-1]);
                else
                    hm.put(nums[i-1], hm.get(nums[i-1])-1);
                
                if(hm.containsKey(nums[j]))
                    count = hm.get(nums[j]);
                
                hm.put(nums[j], count+1);
                res[i] = hm.size();
            }
                
        }
        
        return res;
    }
}