class Solution {
    
    int rlen, collen, count =0, blocks=0;
    public int islandPerimeter(int[][] grid) {
        
        rlen = grid.length;
        collen = grid[0].length;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(grid[i][j]==1) {
                    //count-=2;
                    rec(i, j, grid);
                    break;
                }
                        
            }
        }
        
        return blocks*4-count;
    }
    
    public void rec(int i, int j, int[][] grid) {
        
        
        if(i>=rlen || j>=collen || i<0 || j<0 || grid[i][j]!=1)
            return;
        
        
        if(grid[i][j]==1) {
            
                //count+=2;
            grid[i][j]=-1;
            blocks++;
            
            if(j+1<=collen-1 && grid[i][j+1]!=0)
                count++;
            if(i+1<=rlen-1 && grid[i+1][j]!=0)
                count++;
            if(i-1>=0 && grid[i-1][j]!=0)
                count++;
            if(j-1>=0 && grid[i][j-1]!=0)
                count++;
            
        }
        
        rec(i+1, j, grid);
        rec(i, j-1, grid);
        rec(i-1, j, grid);
        rec(i, j+1, grid);
        
    }
}