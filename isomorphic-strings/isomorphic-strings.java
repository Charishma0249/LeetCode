class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            if(hm1.containsKey(cs))
            {
                if(ct==hm1.get(cs))
                    continue;
                
                return false;
            }
            else if(hm2.containsKey(ct))
            {
                if(cs==hm2.get(ct))
                    continue;
                
                return false;
            }
            else
            {
                hm1.put(cs, ct);
                hm2.put(ct,cs);
            }
            
        }
        
        return true;
    }
}