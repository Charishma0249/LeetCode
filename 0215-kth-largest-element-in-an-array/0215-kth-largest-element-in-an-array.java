class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            
            @Override
            public int compare(Integer a, Integer b) {
                if(b>a) {
                    return 1;
                } else if(b<a) {
                    return -1;
                }
                
                return 0;
            }
        });
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : nums) {
            pq.add(n);
        }
        
        int i=1, res=0;
        
        while(i<=k) {
            res = pq.poll();
            i++;
        }
        
        return res;
    }
}