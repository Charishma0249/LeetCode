class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        
        for(int i=0; i<groupSizes.length; i++) {
            
            List<Integer> al = new ArrayList<>();
            if(hm.containsKey(groupSizes[i])) 
                al = hm.get(groupSizes[i]);
            
            al.add(i);
            hm.put(groupSizes[i], al);
        }
        
        for(Map.Entry<Integer, List<Integer>> entry : hm.entrySet()) {
            int l=0;
            int k = entry.getKey();
            List<Integer> al = entry.getValue();
            
            if(al.size()>=k) {
                int d = al.size()/k;
                for(int i=0; i<d; i++) {
                    ArrayList<Integer> ans = new ArrayList<Integer>();
                    for(int j=0; j<k; j++) {
                        ans.add(al.get(l+j));
                    }
                    
                    l=(i+1)*k;
                    res.add(ans);
                }
            }
            

        }
        return res;
        
    }
}