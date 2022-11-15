class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxEdges = 0, centerNode=1;
        
        for(int i=0; i<edges.length; i++) {
            
            int count = 0;
            if(hm.containsKey(edges[i][0])) {
                count = hm.get(edges[i][0]);
            } 
            
            hm.put(edges[i][0], count+1);
            
            if(maxEdges < count) {
                maxEdges = count;
                centerNode = edges[i][0];
            }
            count = 0;
            
            if(hm.containsKey(edges[i][1])) {
                count = hm.get(edges[i][1]);
            }
            
            hm.put(edges[i][1], count+1);
            
            if(maxEdges < count) {
                maxEdges = count;
                centerNode = edges[i][1];
            }
        }
        
        return centerNode;
    }
}