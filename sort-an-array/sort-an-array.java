class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n : nums) {
            pq.add(n);
        }
        
        int[] res = new int[nums.length];
        int i = -1;
        
        while(!pq.isEmpty()) {
            res[++i] = pq.poll();
        }
        
        return res;
    }
}