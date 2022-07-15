class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int rlen = grid.length;
        int collen = grid[0].length;
        int maxArea = 0;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(grid[i][j]==1) {
                    maxArea = Math.max(maxArea, findIslandArea(grid, i, j, rlen, collen));
                }
            }
        }
        
        return maxArea;
    }
    
    public int findIslandArea(int[][] grid, int i, int j, int rlen, int collen) {
        
        if(i<0 || j<0 || i>=rlen || j>=collen || grid[i][j] <=0) {
            return 0;
        }
        
        grid[i][j]=-1;
        
        return (1 + findIslandArea(grid, i+1, j, rlen, collen)
        + findIslandArea(grid, i, j-1, rlen, collen)
        + findIslandArea(grid, i-1, j, rlen, collen)
        + findIslandArea(grid, i, j+1, rlen, collen));
        
    }
}