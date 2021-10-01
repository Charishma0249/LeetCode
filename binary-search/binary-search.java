class Solution {
    
    int low, high, mid, len;
    public int search(int[] nums, int target) {
        
        len = nums.length;
        mid = len/2;
        int i=0, j=len-1;
        return rec(nums, target, mid, i, j);
    }
    
    public int rec(int[] nums, int target, int mid, int i, int j) {
        
        if(nums[mid]==target)
            return mid;
        
        if(target<nums[mid] && i<j)
            return rec(nums, target, (i+mid)/2, i, mid);
        else if(target>nums[mid] && i<j)
            return rec(nums, target, (mid+1+j)/2, mid+1, j);
        else
            return -1;
    }
}