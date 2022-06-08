class Solution {
    public String longestPalindrome(String s) {
        
        int len = s.length();
        int[][] dp = new int[len][len];
        int max = 0;
        String result="";
        
        for(int i=0; i<len; i++) {
            dp[i][i] = 1;
            result = s.substring(i, i+1);
        }
        
        for(int k=1; k<len; k++) {
            for(int i=0; i+k<len; i++) {
                
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+k);
                
                if((c1==c2 && dp[i+1][i+k-1]==1) || (c1 == c2 && i+1==i+k)) {
                    if(max<k+1) {
                        max = k+1;
                        result = s.substring(i, i+k+1);
                    }
                    dp[i][i+k] = 1;
                } else {
                    dp[i][i+k] = 0;
                }
                
            }
        }
        
        return result;
    }
}