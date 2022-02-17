class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<edges.length; i++){
            
            int hsa=0, hsb=0;
            // HashSet<Integer> hsa = new HashSet<>();
            // HashSet<Integer> hsb = new HashSet<>();
            
            if(hm.containsKey(edges[i][0]))
                hsa = hm.get(edges[i][0]);
            if(hm.containsKey(edges[i][1]))
                hsb = hm.get(edges[i][1]);
            
            // hsa.add(edges[i][1]);
            // hsb.add(edges[i][0]);
            
            hm.put(edges[i][0], hsa+1);
            hm.put(edges[i][1], hsb+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()==hm.size()-1)
                return entry.getKey();
        }
        return -1;
    }
}
 