class Solution {
    public int findCenter(int[][] edges) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = edges.length;
        
        for(int i=0;i<len;i++)
        {
            int count = 1;
            int j = edges[i][0];
            if(hm.containsKey(j))
                count = 1+hm.get(j);
            
            hm.put(j, count);
            
            count = 1;
            j = edges[i][1];
            if(hm.containsKey(j))
                count=1+hm.get(j);
            
            hm.put(j, count);
                
        }
        
        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();
            
            //System.out.println(entry.getKey() +" "+entry.getValue());
            if(entry.getValue()==len)
                return entry.getKey();
        }
        
        return 0;
        
    }
}