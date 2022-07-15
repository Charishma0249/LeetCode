class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int rlen = grid.length;
        int collen = grid[0].length;
        int maxArea = 0;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(grid[i][j]==1) {
                    int area = 1;
                    maxArea = Math.max(maxArea, findIslandArea(grid, i, j, area, rlen, collen));
                }
            }
        }
        
        return maxArea;
    }
    
    public int findIslandArea(int[][] grid, int i, int j, int area, int rlen, int collen) {
        
        if(i<0 || j<0 || i>=rlen || j>=collen || grid[i][j] <=0) {
            return 0;
        }
        
        grid[i][j]=-1;
        
        int sum = 1 + findIslandArea(grid, i+1, j, area, rlen, collen)
        + findIslandArea(grid, i, j-1, area, rlen, collen)
        + findIslandArea(grid, i-1, j, area, rlen, collen)
        + findIslandArea(grid, i, j+1, area, rlen, collen);
        
        return sum;
    }
}