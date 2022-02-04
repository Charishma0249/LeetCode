class Solution {
    int idx=-1;
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        
        binSearch(nums, target, 0, len);
        if(idx==-1)
            return res;
        
        int temp = idx;
         // System.out.println(idx);
        while(idx>=0 && nums[idx]==target) {
            res.add(idx);
            idx--;
        }
        temp++;
        while(temp<len && nums[temp]==target) {
            res.add(temp);
            temp++;
        }
        
        Collections.sort(res);
        return res;
    }
    
    public void binSearch(int[] nums, int target, int start, int end) {
        
        if(start>=end)
            return ;
        
        int mid = (start+end)/2;
        if(target<nums[mid])
            binSearch(nums, target, start, mid);
        else if(target>nums[mid])
            binSearch(nums, target, mid+1, end);
        else
            idx = mid;
        
    }
}