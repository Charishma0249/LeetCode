class KthLargest {

    PriorityQueue<Integer> numsPq = new PriorityQueue<>();
    int position;
    
    public KthLargest(int k, int[] nums) {
        
        position = k;
        
        for(int i=0; i<nums.length; i++)
            numsPq.add(nums[i]);
    }
    
    public int add(int val) {
        
        numsPq.add(val);
        
        while(numsPq.size()>position)
            numsPq.poll();
        
        return numsPq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */