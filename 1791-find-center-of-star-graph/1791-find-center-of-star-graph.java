class Solution {
    public int findCenter(int[][] edges) {
        
        int n = edges.length;
        int[] arr = new int[n+2];
        int centerNode=1;
        
        for(int i=0; i<n; i++) {
            
            arr[edges[i][0]]++;
            
            if(arr[edges[i][0]] == n)
                centerNode = edges[i][0];
            
            arr[edges[i][1]]++;
            
            if(arr[edges[i][1]] == n)
                centerNode = edges[i][1];
        }
        
        return centerNode;
    }
}