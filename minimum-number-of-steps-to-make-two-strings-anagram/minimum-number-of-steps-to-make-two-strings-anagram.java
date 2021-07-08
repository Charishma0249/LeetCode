class Solution {
    public int minSteps(String s, String t) {
        
        HashMap<Character,Integer> smap = new HashMap<>();
        
        int len = s.length(), res=0;
        
        for(int i=0; i<len; i++)
        {
            char cs = s.charAt(i);
            int count = 1;
            
            if(smap.containsKey(cs))
                count = smap.get(cs)+1;
            
            smap.put(cs, count);
            
        }
        
        for(int i=0;i<len;i++)
        {
            char ct = t.charAt(i);
            int count =1;
            if(smap.containsKey(ct))
                count = smap.get(ct)-1;
            
            smap.put(ct, count);
        }
        
        for(int i=0; i<len; i++)
        {
            char c = s.charAt(i);
            if(smap.get(c)>0)
            {
                res += smap.get(c);
                smap.put(c, 0);
                
            }
        }
        
        return res;
    }
}