class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            
            @Override
            public int compare(Integer a, Integer b) {
                if(a<b)
                    return 1;
                else if(a>b)
                    return -1;
                return 0;
            }
        });
        
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
        }
        
        while(k>1) {
            pq.poll();
            k--;
        }
        
        return pq.peek();
    }
}