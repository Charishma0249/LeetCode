class Solution {
    
    int perimeter = 0;
    public int islandPerimeter(int[][] grid) {
        
        int rlen = grid.length, collen = grid[0].length;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                if(grid[i][j]==1) {
                  //  perimeter=2;
                    findPerimeter(i, j, rlen, collen, grid);
                    //return perimeter;
                    break;
                }
            }
        }
        return perimeter;
    }
    
    public void findPerimeter(int i, int j, int rlen, int collen, int[][] grid) {
        
        if(i<0 || i>=rlen || j<0 || j>=collen || grid[i][j]==0)
            return ;
        
        if(grid[i][j]==-1) {
            perimeter--;
            return ;
            
        }
            
        grid[i][j]=-1;
        perimeter+=4;
        
        if(perimeter>4)
            perimeter--;
       // perimeter-=2;
        
        findPerimeter(i+1, j, rlen, collen, grid);
        findPerimeter(i, j-1, rlen, collen, grid);
        findPerimeter(i-1, j, rlen, collen, grid);
        findPerimeter(i, j+1, rlen, collen, grid);
    }
}