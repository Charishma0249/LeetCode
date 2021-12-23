class Solution {
    int res;
    public int findPeakElement(int[] nums) {
        
        int len = nums.length;
        if(len==1)
            return 0;
        
        binSearch(nums, 0, len/2, len-1);
        return res;
    }
    
    public void binSearch(int[] nums, int low, int mid, int high) {
        
        //System.out.println(mid);
        if(mid>0 && mid<nums.length-1 && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
            res = mid;
            return;
        }
        
        else if(mid==0 && nums[mid]>nums[mid+1]) {
            res = mid;
            return;
        }
        
        else if(mid==nums.length-1 && nums[mid]>nums[mid-1]) {
            res = mid;
            return;
        }
            
        
        if(low==high || low+1==high)
            return ;
        
        binSearch(nums, low, (low+mid)/2, mid);
        binSearch(nums, mid, (high+mid+1)/2, high);
    }
}