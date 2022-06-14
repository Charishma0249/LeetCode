class Solution {
    public int minDistance(String word1, String word2) {
        
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];
        
        for(int i=0; i<len1; i++) {
            for(int j=0; j<len2;j++) {
                char c1 = word1.charAt(i);
                char c2 = word2.charAt(j);
                
                if(c1==c2) {
                    dp[i+1][j+1] = dp[i][j]+1;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        
        // for(int i=1; i<len1+1; i++) {
        //     for(int j=1; j<len2+1; j++) {
        //         System.out.println(dp[i][j]);
        //     }
        // }
        return len1+len2-(2*dp[len1][len2]);
    }
}