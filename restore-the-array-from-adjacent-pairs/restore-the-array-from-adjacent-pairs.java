class Solution {
    
    int[] res;
    public int[] restoreArray(int[][] adjacentPairs) {
        
        int rlen = adjacentPairs.length;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        // HashSet<Integer> hs = new HashSet<>();
        int start=-1;
        
        for(int i=0; i<rlen; i++) {
            
            ArrayList<Integer> al = new ArrayList<>();
            
            if(hm.containsKey(adjacentPairs[i][0]))
                al = hm.get(adjacentPairs[i][0]);
            
            al.add(adjacentPairs[i][1]);
            hm.put(adjacentPairs[i][0], al);
            
            al = new ArrayList<>();
            if(hm.containsKey(adjacentPairs[i][1]))
                al = hm.get(adjacentPairs[i][1]);
            
            al.add(adjacentPairs[i][0]);
            hm.put(adjacentPairs[i][1], al);
        }
        
        int size = hm.size();
        res = new int[size];
        for(Map.Entry<Integer, ArrayList<Integer>> entry:hm.entrySet()) {
            
            if(entry.getValue().size()==1) {
                start=entry.getKey();
                dfsRec(hm, new HashSet<Integer>(), start, -1);
                break;
            }
        }
        
        
        return res;
    }
    
    public void dfsRec(HashMap<Integer, ArrayList<Integer>> hm, HashSet<Integer> visited, int node, int ind) {
        
        if(visited.contains(node))
            return ;
        
        res[++ind] = node;
        visited.add(node);
        
        ArrayList al = hm.get(node);
        for(int i=-0; i<al.size(); i++) {
            
            dfsRec(hm, visited, (Integer)al.get(i), ind);
        }
        
    }
}