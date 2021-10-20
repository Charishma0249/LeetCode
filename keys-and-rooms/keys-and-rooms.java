class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int len = rooms.size();
        
        HashSet<Integer> hs = new HashSet<>();
        
        hs.add(0);
        hs = dfs(hs, rooms, rooms.get(0));
        
        if(hs.size()==len)
            return true;
        
        return false;
    }
    
    public HashSet<Integer> dfs(HashSet<Integer> hs, List<List<Integer>> rooms, List<Integer> keys) {
        
        for(int i=0; i<keys.size(); i++) {
            
            int key = keys.get(i);
            if(!hs.contains(key)) {
                hs.add(key);
                dfs(hs, rooms, rooms.get(key));
            }
        }
        
        return hs;
    }
}