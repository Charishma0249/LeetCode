class Solution {
    int count=0;
    int[][] dp;
    public int uniquePaths(int m, int n) {
        
        dp = new int[m][n];
        dp[0][0] = rec(m,n, 0, 0);
        return dp[0][0];
    }
    
    public int rec(int m, int n, int i, int j){
        
        if(i==m || j==n)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        
        if(dp[i][j]>0)
            return dp[i][j];
        dp[i][j] = rec(m, n, i+1, j)+rec(m, n, i, j+1);
        
        return dp[i][j];
    }
}