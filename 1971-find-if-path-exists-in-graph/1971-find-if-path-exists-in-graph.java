class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        
        int len = edges.length;
        for(int i=0; i<len; i++){
            int node1 = edges[i][0];
            int node2 = edges[i][1];
            List<Integer> ls1 = new ArrayList<>();
            List<Integer> ls2 = new ArrayList<>();
            
            if(hm.containsKey(node1))
                ls1 = hm.get(node1);
            if(hm.containsKey(node2))
                ls2 = hm.get(node2);
                
            ls1.add(node2);
            ls2.add(node1);
            
            hm.put(node1, ls1);
            hm.put(node2, ls2);
        }
        
        Queue<Integer> qu = new LinkedList<>();
        
        qu.add(source);
        while(!qu.isEmpty()){
            int tempNode = qu.poll();
            visited.add(tempNode);
            if(tempNode==destination)
                return true;
            if(hm.containsKey(tempNode)){
                List<Integer> ls = hm.get(tempNode);
                for(int i=0; i<ls.size(); i++) {
                    if(!visited.contains(ls.get(i)))
                        qu.add(ls.get(i));
                }
            }
        }
        
        return false;
    }
}

// 0 -> 1,2
// 1 -> 0
// 2 -> 0
// 3 -> 5,4
// 5 -> 3,4
// 4 -> 5,3