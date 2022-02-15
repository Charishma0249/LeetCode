class Solution {
    
    int minSum=Integer.MAX_VALUE, rlen=0, collen=0;
    int[][] dp;
    public int minPathSum(int[][] grid) {
        rlen = grid.length;
        collen = grid[0].length;
        dp = new int[rlen][collen];
        
        dp[0][0] = rec(grid, 0, 0);
        return dp[0][0];
    }
    
    public int rec(int[][] grid, int i, int j){
        
        if(i>=rlen || j>=collen)
            return Integer.MAX_VALUE;
        if(i==rlen-1 && j==collen-1)
            return grid[i][j];
        if(dp[i][j]>0)
            return dp[i][j];
        dp[i][j] = grid[i][j]+Math.min(rec(grid, i+1, j), rec(grid, i, j+1));
        return dp[i][j];
    } 
}