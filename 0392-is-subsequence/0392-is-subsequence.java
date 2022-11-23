class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int slen = s.length();
        int tlen = t.length();
        
        if(slen>tlen) {
            return false;
        }
        
        if(slen==0)
            return true;
        
        int j=0;
        char cs = s.charAt(j);
        
        for(int i=0; i<tlen && j<slen; i++) {
            
            char ct = t.charAt(i);
            
            if(ct==cs) {
                j++;
                if(j==slen) {
                    return true;
                }
                cs = s.charAt(j);
            }
        }
        
        return false;
    }
}