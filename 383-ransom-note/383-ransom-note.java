class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int rlen=ransomNote.length();
        int mlen = magazine.length();
        int[] alp = new int[26];
        
        if(rlen>mlen)
            return false;
        
        for(char c:magazine.toCharArray()){
            alp[c-'a']++;
        }
        
        for(char c:ransomNote.toCharArray()){
            if(alp[c-'a']==0)
                return false;
            alp[c-'a']--;
        }
        
        return true;
    }
}