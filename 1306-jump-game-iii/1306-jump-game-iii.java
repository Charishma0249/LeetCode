class Solution {
    boolean[] visited;
    public boolean canReach(int[] arr, int start) {
        
        visited = new boolean[arr.length];
        return dfs(arr, start);
    }
    
    public boolean dfs(int[] arr, int idx){
        
        if(idx<0 || idx>=arr.length || visited[idx])
            return false;
       
        if(arr[idx]==0)
            return true;
        visited[idx] = true;
        return (dfs(arr, idx+arr[idx]) || dfs(arr, idx-arr[idx]));
        
    }
}