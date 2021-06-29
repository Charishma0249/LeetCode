class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                    count = 1+ rec(grid,i,j,m,n,count);  
            }
        }
        
        return count;
    }
    
    public int rec(char[][] grid, int i, int j, int m, int n, int count)
    {
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='2' || grid[i][j]=='0')
            return count;
        
        if(grid[i][j]=='1')
        {
           // System.out.println("i = "+i+" j = "+j);
            grid[i][j]='2';
        }
        rec(grid, i+1, j, m, n, count);
        rec(grid, i, j-1, m, n, count);
        rec(grid, i-1, j, m, n, count);
        rec(grid, i, j+1, m, n, count);
        
        
        return count;    
    }
}