class Solution {
    public int maximumScore(int a, int b, int c) {
     
        PriorityQueue<Integer> pq = new PriorityQueue<> (Collections.reverseOrder());
        
        int count = 0;
        
        pq.add(a);
        pq.add(b);
        pq.add(c);
        
        while(pq.peek()>0) {
            
            int m = pq.poll();
            int n = pq.poll();
            
            if(m>0 && n>0) {
                pq.add(m-1);
                pq.add(n-1);
                
                count++;
            }
                
        }
        
        return count;
    }
}