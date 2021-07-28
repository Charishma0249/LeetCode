class Solution {
    HashSet<Integer> hs = new HashSet<>();
    
    public int searchInsert(int[] nums, int target) {
        
        int len = nums.length;
        return binSearch(nums, target, len, len/2);
    }
    
    public int binSearch(int[] nums, int target, int len, int i)
    {
        int res = -1;
        
        hs.add(i);
        if(i<0)
            return 0;
        if(i>=len)
            return len;
        if(nums[i]==target)
            return i;
        if(target < nums[i])
        {
            if(hs.contains(i-1))
                return i;
            res = binSearch(nums, target, len, i-1);
        }
        else if(target > nums[i])
        {
            if(hs.contains(i+1))
                return i+1;
            res = binSearch(nums, target, len, i+1);
        }
        
        return res;
    }
}