class Solution {
    public int countNegatives(int[][] grid) {
        
        int len = grid[0].length;
        int count=0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0, k=len-1; j<=k;)
            {
                if(grid[i][k]>=0)
                    break;
                else if(grid[i][k]<0)
                {
                    k--;
                    count++;
                }
                
                if(grid[i][j]>=0)
                    j++;
                else if(grid[i][j]<0 && j<k)
                {
                    j++;
                    count++;
                }
                
            }
          //  System.out.println(count);
        }
        
        return count;
    }
}