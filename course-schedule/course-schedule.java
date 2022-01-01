class Solution {
    public boolean canFinish(int numCourses, int[][] prereq) {
        
        int[] visited = new int[numCourses];
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int len = prereq.length;
        
        for(int i=0; i<len; i++) {
            int x = prereq[i][0];
            int y = prereq[i][1];
            
            ArrayList<Integer> al = new ArrayList<>();
            if(hm.containsKey(x)) {
                al = hm.get(x);
            }
            al.add(y);
            hm.put(x, al);
        }
        
        boolean res = true;
        for(Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet()) {
            int x = entry.getKey();
            ArrayList<Integer> al = entry.getValue();
            
            if(visited[x]==1)
                continue;
            
            visited[x] = 2;
            for(int i=0; i<al.size(); i++) {
                
                if(visited[al.get(i)]==2)
                    return false;
                res = res && dfs(hm, visited, al.get(i));
                visited[al.get(i)] = 1;
            }
            visited[x] = 1;
        }
        
        return res;
    }
    
    public boolean dfs(HashMap<Integer, ArrayList<Integer>> hm, int[] visited, int i) {
        
        if(!hm.containsKey(i) || visited[i]==1)
            return true;
        
        boolean res = true;
        ArrayList<Integer> al = hm.get(i);
        
        for(int j=0; j<al.size(); j++) {
            
            if(visited[al.get(j)]==2)
                return false;
            
            visited[al.get(j)] = 2;
            res = res && dfs(hm, visited, al.get(j));
            visited[al.get(j)] = 1;
        }
        
        visited[i]=1;
        
        return res;
    }
}