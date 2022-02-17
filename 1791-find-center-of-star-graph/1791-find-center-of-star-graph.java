class Solution {
    public int findCenter(int[][] edges) {
        
        int len = edges.length;
        int[] arr = new int[len+1];
        for(int i=0; i<len; i++){
            
            arr[edges[i][0]-1]++;
            arr[edges[i][1]-1]++;
            
            if(arr[edges[i][0]-1]>1)
                return edges[i][0];
            else if(arr[edges[i][1]-1]>1)
                return edges[i][1];
        }
        
        return 0;
    }
}
 