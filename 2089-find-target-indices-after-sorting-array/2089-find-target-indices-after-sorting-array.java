class Solution {
    
    List<Integer> res = new ArrayList<>();
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int len = nums.length;
        
        Arrays.sort(nums);
        binSearch(nums, target, 0, len);
        
        Collections.sort(res);
        return res;
    }
    
    public void binSearch(int[] nums, int target, int start, int end) {
        
        // if(start==end && nums[start]==target)
        //     res.add(start);
        if(start>=end)
            return ;
        
        int mid = (start+end)/2;
        if(nums[mid]==target)
            res.add(mid);
        
        if(target<=nums[mid])
            binSearch(nums, target, start, mid);
        if(target>=nums[mid])
            binSearch(nums, target, mid+1, end);
        // else {
        //     res.add(mid);
        //     binSearch(nums, target, start, mid);
        //     binSearch(nums, target, mid+1, end);
        // }
        
    }
}