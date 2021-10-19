class Solution {
    
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<edges.size(); i++) {
            
            hs1.add(edges.get(i).get(0));
            hs2.add(edges.get(i).get(1));
            
        }
        
        Iterator itr = hs1.iterator();
        
        while(itr.hasNext()) {
            
            int node = (int)itr.next();
            if(!hs2.contains(node))
                res.add(node);
        }
        
        return res;
    }
    
    
}