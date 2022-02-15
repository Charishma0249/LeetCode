class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] alp = new int[26];
        int res = 0;
        char c = s.charAt(0);
        alp[c-'A']++;
        
        for(int l=0,r=0; l<s.length() && r<s.length(); ){
            
            int max = 0;
            
            for(int i=0; i<26; i++)
                max = Math.max(max, alp[i]);
            
            if(r-l+1-max<=k) {
                res = Math.max(res, r-l+1);
                // System.out.println("res = "+res+" l = "+l+" r = "+r);
            }
            else {
                alp[s.charAt(l)-'A']--;
                l++;
                if(r==s.length()-1 && r-l<max)
                    break;
                if(l<s.length()) {
                    c = s.charAt(l);

                }
                continue;
            }
            
            r++;
            if(r<s.length()) {
                c = s.charAt(r);
                alp[c-'A']++;
            }
        }
        
        return res;
    }
}