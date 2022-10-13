class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int rlen = grid.length;
        int collen = grid[0].length;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(grid[i][j]==1)
                    return dfs(grid, rlen, collen, i, j);
            }
        }
        
        return 0;
    }
    
    public int dfs(int[][] grid, int rlen, int collen, int i, int j) {
        
        if(i<0 || j<0 || i>=rlen || j>=collen || grid[i][j]==0) {
            return 1;
        }
        
        if(grid[i][j]==-1)
            return 0;
        
        grid[i][j] = -1;
        
        return dfs(grid, rlen, collen, i+1, j)
            + dfs(grid, rlen, collen, i, j-1)
            + dfs(grid, rlen, collen, i-1, j)
            + dfs(grid, rlen, collen, i, j+1);
        
        // System.out.println(sum);
        // return sum;
    }
}