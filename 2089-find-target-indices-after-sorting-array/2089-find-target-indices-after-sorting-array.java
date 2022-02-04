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
       
        if(start>=end)
            return ;
        
        int mid = (start+end)/2;
        if(nums[mid]==target)
            res.add(mid);
        
        if(target<=nums[mid])
            binSearch(nums, target, start, mid);
        if(target>=nums[mid])
            binSearch(nums, target, mid+1, end);
        
    }
}