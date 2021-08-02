class Solution {
    
    int rlen, collen, notIsland=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        rlen = grid1.length;
        collen = grid1[0].length;
        int count = 0;
        
        for(int i=0; i<rlen;i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(grid2[i][j]==1)
                {
                    notIsland=0;
                    rec(grid2, grid1, i, j);
                    
                    if(notIsland==0)
                        count++;
                }
            }
        }
        
        return count;
        
    }
    
    public void rec(int[][] grid2, int[][] grid1, int i, int j)
    {
        if(i<0 || j<0 || i>=rlen || j>=collen || grid2[i][j]!=1)
            return ;
        
        if(grid2[i][j]==1 && grid1[i][j]==1)
            grid2[i][j]=2;
        
        else if(grid2[i][j]==1 && grid1[i][j]!=1)
        {
            grid2[i][j]=2;
            notIsland++;
        }
        
        rec(grid2, grid1, i+1, j);
        rec(grid2, grid1, i, j-1);
        rec(grid2, grid1, i-1, j);
        rec(grid2, grid1, i, j+1);
        
        return ;
    }
}