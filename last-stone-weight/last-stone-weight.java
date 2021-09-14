class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> priorityStones = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<stones.length; i++)
            priorityStones.add(stones[i]);
        
        while(priorityStones.size()>1) {
            int y = priorityStones.poll();
            int x = priorityStones.poll();
            
            if(x!=y)
                priorityStones.add(y-x);
        }
        
        if(priorityStones.isEmpty())
            return 0;
        
        return priorityStones.poll();
    }
}