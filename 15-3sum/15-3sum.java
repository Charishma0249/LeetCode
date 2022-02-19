class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        
        for(int i=0; i<len; i++){
            int target = nums[i]*(-1);
            
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int j=i+1; j<len; j++){
                
                if(hm.containsKey(target-nums[j])){
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(target-nums[j]);
                    al.add(nums[j]);
                    // System.out.println(nums[i]+" "+nums[j] +" "+target);
                    if(!res.contains(al))
                        res.add(al);
                }
                else
                    hm.put(nums[j], j);
            }
        }
        
        return res;
    }
}