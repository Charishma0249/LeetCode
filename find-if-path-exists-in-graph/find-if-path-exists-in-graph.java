class Solution {
    public boolean validPath(int num, int[][] edges, int start, int end) {
        
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        
        int[] visited = new int[num];
        
        for(int i=0; i<edges.length; i++) {
            
            ArrayList<Integer> al = new ArrayList<>();
            int n = edges[i][0];
            int m = edges[i][1];
            if(hm.containsKey(n)) 
                al = hm.get(n);
            
            al.add(m);
            
            hm.put(n, al);
            
            al = new ArrayList<Integer>();
            if(hm.containsKey(m))
                al = hm.get(m);
            
            al.add(n);
            
            hm.put(m, al);
        }
        
        if(hm.size()==0 && num==1 && start==end)
            return true;
        if(!hm.containsKey(start) || !hm.containsKey(end))
                return false;
        
        return dfs(hm, start, end, visited);
    }
    
    public boolean dfs(HashMap<Integer, ArrayList<Integer>> hm, int start, int end, int[] visited) {
        if(start==end)
            return true;
        
        if(visited[start]==1)
            return false;
        
        visited[start]=1;
        
        ArrayList<Integer> al = hm.get(start);
        for(int i=0; i<al.size(); i++) {
            boolean res = dfs(hm, al.get(i), end, visited);
            
            if(res==true)
                return res;
        }
        
        return false;
    }
}