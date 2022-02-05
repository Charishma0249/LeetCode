class Solution {
    public int sumOfUnique(int[] nums) {
        int res =0;
        Arrays.sort(nums);
        if(nums.length==1)
            return nums[0];
        for(int i=0; i<nums.length; i++){
            if(i==0 && nums[i]!=nums[i+1])
                res+=nums[i];
            else if(i==nums.length-1 && nums[i]!=nums[i-1])
                res+=nums[i];
            else if(i!=0 && i!= nums.length-1 && nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
                res+=nums[i];
            
        }
//         HashMap<Integer, Integer> hm = new HashMap<>();
//         for(int i=0; i<nums.length;i++) {
//             int count =0;
//             if(hm.containsKey(nums[i]))
//                 count = hm.get(nums[i]);
//             hm.put(nums[i], count+1);
//         }
        
//         for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//             if(entry.getValue()==1)
//                 res += entry.getKey();
//         }
        
        return res;
    }
}