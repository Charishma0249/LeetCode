class Solution {
    public String customSortString(String order, String str) {
        
        StringBuilder sb = new StringBuilder("");
        HashMap<Character, Integer> hm = new HashMap<>();
        int count;
        
        for(int i=0;i<str.length();i++)
        {
            count=1;
            char a = str.charAt(i);
            
            if(hm.containsKey(a))
                count = 1+hm.get(a);
            
            hm.put(a, count);
            
        }
        
        for(int i=0;i<order.length();i++)
        {
            char a = order.charAt(i);
            
            if(hm.containsKey(a))
            {
                int j= hm.get(a);
                while(j>0)
                {
                    sb.append(a);
                    j--;
                }
                
                hm.remove(a);
            }
        }
        
        Iterator<Map.Entry<Character, Integer>> itr = hm.entrySet().iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<Character, Integer> entry = itr.next();
            int j = entry.getValue();
            
            char a = entry.getKey();
            while(j>0)
            {
               sb.append(a);
               j--;
            }
        }
        
        return sb.toString();
    }
}