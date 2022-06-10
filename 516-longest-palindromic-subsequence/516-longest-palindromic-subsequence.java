class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int len = s.length();
        int[][] dp = new int[len][len];
        
        for(int i=0; i<len; i++) {
            dp[i][i] = 1;
        }
        
        for(int k=1; k<len; k++) {
            for(int i=0; i+k<len; i++) {
                
                int j=i+k;
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                
                if(c1==c2) {
                    dp[i][j] = 2+dp[i+1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        
        return dp[0][len-1];
    }
}