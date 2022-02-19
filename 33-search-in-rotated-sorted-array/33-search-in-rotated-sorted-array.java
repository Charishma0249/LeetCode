class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length;
        int n = findPivotElement(nums, 0, len);
        // System.out.println("n = "+n);
        if(n==-1){
            if(target!=nums[0])
                return -1;
            else
                return findElement(nums, 0, len, target);
        }
            
        if(nums[n]==target)
            return n;
        
        int res1 = findElement(nums, 0, n, target);
        int res2 = findElement(nums, n+1, len, target);
        
        // System.out.println(res1+" "+res2);
        if(res1==-1 && res2==-1)
            return -1;
        else if(res1!=-1)
            return res1;
        else
            return res2;
        
    }
    
    public int findPivotElement(int[] nums, int start, int end){
        
        if(start>=end)
            return -1;
        
        int mid = (start+end)/2;
        // System.out.println(mid);
        if((mid+1<nums.length && nums[mid]>nums[mid+1]) && (mid-1>=0 && nums[mid]>nums[mid-1]))
            return mid;
        if(mid-1<0 && mid+1<nums.length && nums[mid]>nums[mid+1])
            return mid;
        if(mid-1>=0 && mid+1>=nums.length && nums[mid]>nums[mid-1])
            return mid;
        
        int res1 = findPivotElement(nums, start, mid);
        int res2 = findPivotElement(nums, mid+1, end);
        
        if(res1!=-1)
            return res1;
        if(res2!=-1)
            return res2;
        
        return -1;
    }
    
    public int findElement(int[] nums, int start, int end, int target){
        
        if(start>=end)
            return -1;
        
        int res1, res2;
        int mid = (start+end)/2;
        if(target==nums[mid])
            return mid;
        if(target<nums[mid]){
            res1 = findElement(nums, start, mid, target);
            if(res1!=-1)
                return res1;
        }
        else{
            res2 = findElement(nums, mid+1, end, target);
            if(res2!=-1)
                return res2;
        }
        
        return -1;
    }
}