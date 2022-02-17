class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        
        for(int i=0; i<edges.length; i++){
            
            HashSet<Integer> hsa = new HashSet<>();
            HashSet<Integer> hsb = new HashSet<>();
            
            if(hm.containsKey(edges[i][0]))
                hsa = hm.get(edges[i][0]);
            if(hm.containsKey(edges[i][1]))
                hsb = hm.get(edges[i][1]);
            
            hsa.add(edges[i][1]);
            hsb.add(edges[i][0]);
            
            hm.put(edges[i][0], hsa);
            hm.put(edges[i][1], hsb);
        }
        
        for(Map.Entry<Integer, HashSet<Integer>> entry : hm.entrySet()){
            if(entry.getValue().size()==hm.size()-1)
                return entry.getKey();
        }
        return -1;
    }
}
 