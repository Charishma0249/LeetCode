class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        int max = Integer.MIN_VALUE;
        HashSet<Integer> visited = new HashSet<>();
        
        if(nums.length==0)
            return 0;
        
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        
        for(int i=0; i<nums.length; i++){
            if(visited.contains(nums[i]))
                continue;
            if(!hs.contains(nums[i]-1)){
                int n = nums[i]+1;
                int count = 1;
                while(hs.contains(n)) {
                    visited.add(n);
                    count++;
                    n++;
                }
                
                max = Math.max(max, count);
            }
            visited.add(nums[i]);
        }
        
        return max == Integer.MIN_VALUE ? 1 : max;
    }
}