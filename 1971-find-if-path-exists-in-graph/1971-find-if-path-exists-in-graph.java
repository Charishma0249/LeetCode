class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        int num = edges.length;
        Queue<Integer> qu = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        
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
        
        qu.add(source);
        while(!qu.isEmpty()) {
            int temp = qu.poll();
            
            if(visited.contains(temp))
                continue;
            
            visited.add(temp);
            if(temp==destination)
                return true;
            if(hm.containsKey(temp)) {
                ArrayList<Integer> arr = hm.get(temp);
                
                for(int i=0; i<arr.size(); i++) {
                    qu.add(arr.get(i));
                }
            }
        }
        
        return false;
    }
}