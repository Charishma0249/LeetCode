class Solution {
    
    int rlen, collen,res =0;
    public int orangesRotting(int[][] grid) {
        
        rlen = grid.length;
        collen = grid[0].length;
        LinkedList<Integer> pqi = new LinkedList<>();
        LinkedList<Integer> pqj = new LinkedList<>();
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(grid[i][j]==2)
                {
                    pqi.add(i);
                    pqj.add(j);
            
                }
            }
        }
        
        int count = pqi.size();
        int k=0;
        
        while(!pqi.isEmpty())
        {
            
            int i= pqi.poll();
            int j= pqj.poll();
            
            //System.out.println("Hey i = "+i+" j = "+j);
            
            k++;
            
            if(i+1<rlen && grid[i+1][j]==1)
            {
                int l = i+1;
             //   System.out.println("i = "+l+" j = "+j);
                pqi.add(i+1);
                pqj.add(j);
                
                grid[i+1][j]=2;
            }
            
            if(j+1<collen && grid[i][j+1]==1)
            {
                int l = j+1;
               // System.out.println("i = "+i+" j = "+l);
                pqi.add(i);
                pqj.add(j+1);
                
                grid[i][j+1]=2;
            }
            
            if(i-1>=0 && grid[i-1][j]==1)
            {
                int l= i-1;
              //  System.out.println("i = "+l+" j = "+j);
                pqi.add(i-1);
                pqj.add(j);
                
                grid[i-1][j]=2;
            }
            
            if(j-1>=0 && grid[i][j-1]==1)
            {
                int l=j-1;
               // System.out.println("i = "+i+" j = "+l);
                pqi.add(i);
                pqj.add(j-1);
                
                grid[i][j-1]=2;
            }
            
            if(k==count)
            {
                res++;
                count=pqi.size();
                k=0;
                
               // System.out.println(res);
            }
        }
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        
        return (res==0)? res : res-1;
    }
    
  
}