class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int[] arr = new int[edges.length+2];
        int maxEdges = 0, centerNode=1;
        
        for(int i=0; i<edges.length; i++) {
            
            arr[edges[i][0]]++;
            
            if(maxEdges < arr[edges[i][0]]) {
                maxEdges = arr[edges[i][0]];
                centerNode = edges[i][0];
            }
            
            arr[edges[i][1]]++;
            
            if(maxEdges < arr[edges[i][1]]) {
                maxEdges = arr[edges[i][1]];
                centerNode = edges[i][1];
            }
        }
        
        return centerNode;
    }
}