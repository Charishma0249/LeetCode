class Solution {
    int[][] dp;
    public int numDecodings(String s) {
        
        dp = new int[s.length()][s.length()];
        for(int i=0; i<s.length(); i++){
            Arrays.fill(dp[i], -1);
        }
        return rec(s, 0, 0) + rec(s, 0, 1);
    }
    
    public int rec(String s, int i, int j){
        if(i==s.length() || j==s.length() || (s.charAt(i)=='0' || ((i!=j) && (10*(s.charAt(i)-'0')+s.charAt(j)-'0')>26)))
            return 0;
        
        if(i==s.length()-1 || j==s.length()-1)
            return 1;
        
        if(dp[i][j]>=0)
            return dp[i][j];
        
        if(i!=j && (10*(s.charAt(i)-'0')+s.charAt(j)-'0')<=26) {
            dp[i][j] = rec(s, j+1, j+1) + rec(s, j+1, j+2);
            return dp[i][j];
        }
        
        
        dp[i][j] = rec(s, i+1, i+1)+rec(s, i+1, i+2);
        return dp[i][j];
    }
}