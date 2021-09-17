class Solution {
    public int connectSticks(int[] sticks) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int stick : sticks) {
            pq.add(stick);
        }
        
        int i, j;
        int cost=0;
        while(pq.size()>1) {
            
            i = pq.poll();
            j = pq.poll();
            pq.add(i+j);
            cost += i+j;
        }
        
        return cost;
    }
}