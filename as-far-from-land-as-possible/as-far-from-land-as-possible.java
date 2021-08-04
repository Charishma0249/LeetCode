class Solution {
    
    int rlen, collen,k,l;
    public int maxDistance(int[][] grid) {
        
        rlen = grid.length;
        collen = grid[0].length;
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                
                if(grid[i][j]==1)
                    grid[i][j]=0;
                else
                    grid[i][j]=min;
            }   
        }
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(grid[i][j]==0)
                {
                    k=i;
                    l=j;
                    rec(grid, i, j, grid[i][j]);
                }
            }
        }
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                max = Math.max(max, grid[i][j]);
            }
        }
        
        return (max==Integer.MAX_VALUE || max==0)? -1 : max;
    }
    
    public void rec(int[][] grid, int i, int j, int val)
    {
        if(i<0 || j<0 || i>=rlen || j>=collen || ((k!=i || l!=j) && val+1>=grid[i][j]))
            return ;
        
        if(val+1<grid[i][j])
            grid[i][j] = val+1;
        
        rec(grid, i+1, j, grid[i][j]);
        rec(grid, i, j-1, grid[i][j]);
        rec(grid, i-1, j, grid[i][j]);
        rec(grid, i, j+1, grid[i][j]);
        
    }
    

}