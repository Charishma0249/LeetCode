class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        int slen = s.length();
        int tlen = t.length();
        
        if(slen!=tlen)
            return false;
        
        for(int i=0; i<slen; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if(hm.containsKey(sc)) {
                hm.put(sc, hm.get(sc)+1);
            } else {
                hm.put(sc, 1);
            }
            
            if(hm.containsKey(tc)) {
                hm.put(tc, hm.get(tc)-1);
            } else {
                hm.put(tc, -1);
            }
        }
        
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            
            if(entry.getValue()!=0) {
                return false;
            }
        }
        
        return true;
    }
}