class Solution {
    int area = 0, count=0;
    public int maxAreaOfIsland(int[][] grid) {
        
        int rlen = grid.length, collen = grid[0].length;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(grid[i][j]==1) {
                    count=0;
                    findLargeIsland(i, j, rlen, collen, grid);
                    area = Math.max(area, count);
                }
                    
            }
        }
        
        return area;
    }
    
    public void findLargeIsland(int i, int j, int rlen, int collen, int[][] grid) {
        
        if(i<0 || i>=rlen || j<0 || j>=collen || grid[i][j]!=1)
            return ;
        
        count++;
        grid[i][j]=2;
        findLargeIsland(i+1, j, rlen, collen, grid);
        findLargeIsland(i, j-1, rlen, collen, grid);
        findLargeIsland(i-1, j, rlen, collen, grid);
        findLargeIsland(i, j+1, rlen, collen, grid);
    }
}