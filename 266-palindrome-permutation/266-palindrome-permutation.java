class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] alp = new int[26];
        int count =0;
        
        for(int i=0; i<s.length(); i++) {
            
            char c = s.charAt(i);
            
            alp[c-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            
            if(alp[i]%2!=0) {
                count++;
            }
        }
        
        return count<=1;
    }
}