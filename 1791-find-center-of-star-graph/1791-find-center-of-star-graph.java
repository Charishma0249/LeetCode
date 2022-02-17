class Solution {
    public int findCenter(int[][] edges) {
        
        int len = edges.length;
        int[] arr = new int[len+1];
        for(int i=0; i<len; i++){
            
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            arr[node1-1]++;
            arr[node2-1]++;
            
            if(arr[node1-1]>1)
                return node1;
            else if(arr[node2-1]>1)
                return node2;
        }
        
        return 0;
    }
}
 