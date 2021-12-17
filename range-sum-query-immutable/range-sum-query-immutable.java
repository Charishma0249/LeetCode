class NumArray {

    int[] n;
    public NumArray(int[] nums) {
        n = new int[nums.length];
        
        n[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            n[i] = nums[i]+n[i-1];
           // System.out.println(n[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        
        int res;
        if(left==0)
            res = n[right];
        else 
            res = n[right]-n[left-1];
        
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */