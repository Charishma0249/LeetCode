class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        int[][] dp = new int[len][len]; 
        int maxLen = 0;
        // StringBuilder sb = new StringBuilder();
        String result = "";
        
        for(int k=0; k<len; k++) {
            for(int i=0; i+k<len; i++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+k);
                
                if(c1==c2 && k<=1) {
                    dp[i][i+k] = k+1;
                }
                else if(c1==c2 && dp[i+1][i+k-1]>0) {
                    dp[i][i+k] = 2+dp[i+1][i+k-1];
                } 
                if(maxLen<dp[i][i+k]) {
                    maxLen = dp[i][i+k];
                    result = s.substring(i, i+k+1);
                }
            }
        }
        
        return result;
    }
}