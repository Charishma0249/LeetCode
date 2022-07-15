class Solution {
    public boolean isAnagram(String s, String t) {
        int[] scount = new int[26];
        
        int slen = s.length();
        int tlen = t.length();
        
        if(slen!=tlen)
            return false;
        
        for(int i=0; i<slen; i++) {
            char sc = s.charAt(i);
            scount[sc-'a']++;
            
            char tc = t.charAt(i);
            scount[tc-'a']--;
        }
        
        for(int i=0; i<26; i++) {
            if(scount[i]!=0) {
                return false;
            }
        }
        
        return true;
    }
}