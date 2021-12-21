class Solution {
    public int closedIsland(int[][] grid) {
        
        int rlen = grid.length, collen = grid[0].length;
        int count =0;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                if(grid[i][j]==0) {
                    boolean res = findClosedIsland(i, j, rlen, collen, grid);
                    if(res) {
                        //System.out.println("i = "+i+" j = "+j);
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    public boolean findClosedIsland(int i, int j, int rlen, int collen, int[][] grid) {
        
        if(i<0 || i>=rlen || j<0 || j>=collen)
            return false;
        
        if(grid[i][j]!=0)
            return true;
        
        grid[i][j]=-1;
        boolean b1 = findClosedIsland(i+1, j, rlen, collen, grid);
        boolean b2 = findClosedIsland(i, j-1, rlen, collen, grid);
        boolean b3 = findClosedIsland(i-1, j, rlen, collen, grid);
        boolean b4 = findClosedIsland(i, j+1, rlen, collen, grid);
        
        return b1&&b2&&b3&&b4;
    }
}