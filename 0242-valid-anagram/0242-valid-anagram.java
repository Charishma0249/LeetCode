class Solution {
    public boolean isAnagram(String s, String t) {
        
        int slen = s.length();
        int tlen = t.length();
        int[] counter = new int[26];
        
        if(slen!=tlen)
            return false;
        
        
        for(char sc : s.toCharArray()) {
            counter[sc-'a']++;
        }
        
        for(char st : t.toCharArray()) {
            counter[st-'a']--;
        }
        
        for(int i=0; i<26; i++) {
            if(counter[i]!=0)
                return false;
        }
        
        return true;
    }
}