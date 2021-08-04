class Solution {
    
    int rlen, collen;
    public int maxDistance(int[][] grid) {
        
        rlen = grid.length;
        collen = grid[0].length;
        
        int max = Integer.MIN_VALUE, min = 201;
        
        LinkedList<Integer> ali0 = new LinkedList<>();
        LinkedList<Integer> alj0 = new LinkedList<>();
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                
                if(grid[i][j]==1)
                {
                    grid[i][j]=0;
                    ali0.add(i);
                    alj0.add(j);
                }
                else
                    grid[i][j]=min;
            }   
        }
        
        while(ali0.size()>0)
        {
            int i = ali0.poll();
            int j = alj0.poll();
            int val = grid[i][j];
            
            if(i+1<rlen && val+1<grid[i+1][j])
            {
                ali0.add(i+1);
                alj0.add(j);
                
                grid[i+1][j] = val+1;
            }
            if(i-1>=0 && val+1<grid[i-1][j])
            {
                ali0.add(i-1);
                alj0.add(j);
                
                grid[i-1][j]=val+1;
            }
            if(j+1<collen && val+1<grid[i][j+1])
            {
                ali0.add(i);
                alj0.add(j+1);
                
                grid[i][j+1]=val+1;
            }
            if(j-1>=0 && val+1<grid[i][j-1])
            {
                ali0.add(i);
                alj0.add(j-1);
                
                grid[i][j-1]=val+1;
            }
            
        }
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                max = Math.max(max, grid[i][j]);
            }
        }
        
        return (max==min || max==0)? -1 : max;
    }
    

}