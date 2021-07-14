class Solution {
    
    int[] row;
    int[] col;
    int k=-1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    public int maxDistance(int[][] grid) {
        
        int len = grid.length;
        int size =len*len;
        
        row = new int[size];
        col = new int[size];
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(grid[i][j]==1)
                {
                    k++;
                    row[k]=i;
                    col[k]=j;
                }
            }
        }
        
        if(k==-1)
            return -1;
        
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(grid[i][j]==0)
                {
                    min = Integer.MAX_VALUE;
                    for(int l=0;l<=k;l++)
                    {
                        int sum =Math.abs(i-row[l])+Math.abs(j-col[l]);
                        
                        if(sum<min)
                            min=sum;
                    }
                    
                    if(min>max)
                        max=min;
                }
            }
        }
        
        return (max == Integer.MIN_VALUE)? -1 : max;
        
    }

}