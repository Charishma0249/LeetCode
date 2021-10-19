class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        dfs(graph, 0, graph.length-1, new ArrayList<Integer>());
        
        return res;
    }
    
    public ArrayList<Integer> dfs(int[][] graph, int node, int end, ArrayList<Integer> path) {
        
        path.add(node);
        
        if(node==end) {
            res.add(new ArrayList<>(path));
            return path;
        }
        
        for(int i=0; i<graph[node].length; i++) {
            path = dfs(graph, graph[node][i], end, path);
            
            path.remove(Integer.valueOf(graph[node][i]));
        }
        
        return path;
    }
}