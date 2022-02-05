class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] alp = new int[26];
        int res=0;
        for(char c : chars.toCharArray()) {
            alp[c-'a']++;
        }
        
        for(String s : words) {
            int[] temp = new int[26];
            for(char c : s.toCharArray()) {
                temp[c-'a']++;
            }
            boolean flag=true;
            for(char c : s.toCharArray()) {
                if(temp[c-'a']>alp[c-'a']) {
                    flag=false;
                    break;
                }
            }
            if(flag)
                res+=s.length();
        }
        
        return res;
    }
}