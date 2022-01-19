class Solution {
    public int firstUniqChar(String s) {
        
        int[] alp = new int[26];
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            alp[c-'a']++;
        }
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(alp[c-'a']==1)
                return i;
        }
        
        return -1;
    }
}