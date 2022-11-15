class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int num = edges.length;
        int[] a = new int[n+1];
        
        for(int i=0; i<num; i++) {
            
            ArrayList<Integer> arr = new ArrayList<>();
            if(hm.containsKey(edges[i][0])) {
                arr = hm.get(edges[i][0]);
            }
            
            arr.add(edges[i][1]);
            hm.put(edges[i][0], arr);
            
            arr = new ArrayList<>();
            if(hm.containsKey(edges[i][1])) {
                arr = hm.get(edges[i][1]);
            }
            
            arr.add(edges[i][0]);
            hm.put(edges[i][1], arr);
        }
        
        return dfs(source, destination, hm, a);

    }
    
    public boolean dfs(int temp, int des, HashMap<Integer, ArrayList<Integer>> hm, int[] a) {
        
        if(temp==des) {
            return true;
        }
        
        if(a[temp]==1 || !hm.containsKey(temp)) {
            return false;
        }
        a[temp]=1;
        ArrayList<Integer> arr = hm.get(temp);
        
        boolean result = false;
        for(int i=0; i<arr.size(); i++) {
            temp = arr.get(i);
            result = result || dfs(temp, des, hm, a);
            
            if(result)
                return true;
        }
        
        return result;
    }
}