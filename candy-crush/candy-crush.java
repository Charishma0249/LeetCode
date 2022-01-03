class Solution {
    int rlen, collen, count1=0, count2=0, min, max;
    public int[][] candyCrush(int[][] board) {
        
        rlen = board.length;
        collen = board[0].length;
        int res =0;
        
        while(true) {
            res =0;
           // System.out.println("Hey------");
        for(int i=rlen-1; i>=0; i--) {
            for(int j=0; j<collen; j++) {
                count1=0;
                count2=0;
                
                if(board[i][j]==0) 
                    continue;
                int n=board[i][j];
                if(n<0)
                    n = n*(-1);
                dfsVer(board, i, j, n, 0);
               // System.out.println("n = "+n+" count = "+count);
                dfsHor(board, i, j, n, 0);
               // System.out.println("n = "+board[i][j]+" count1 = "+count1+" count2 = "+count2);
                if(count1>=3)
                    dfsVer(board, i-1, j, n, 1);
                if(count2>=3)
                    dfsHor(board, i, j+1, n, 1);
                
                if((count1>=3 || count2>=3) && board[i][j]>0)
                    board[i][j]=board[i][j]*(-1);
                
            }
        }
            //System.out.println(board.toString);
            if(!moveZeroes(board))
                break;
        }
        
        return board;
        
    }
    
    public void dfsVer(int[][] grid, int i, int j, int n, int flag) {
        
        if(i<0 || i>=rlen || j<0 || j>=collen || (grid[i][j]>0 && grid[i][j]!=n) || (grid[i][j]<0 && grid[i][j]!=n*(-1)) || grid[i][j]==0)
            return ;
        
        if(flag==1 && grid[i][j]>0)
            grid[i][j]=n*(-1);
        
        count1++;
        
       // dfs(grid, i+1, j, n);
        //dfs(grid, i, j-1, n);
        dfsVer(grid, i-1, j, n, flag);
    }
    
    public void dfsHor(int[][] grid, int i, int j, int n, int flag) {
       // System.out.println(" i = "+i+" j = "+j+" n = "+n);
        if(i<0 || i>=rlen || j<0 || j>=collen || (grid[i][j]<0 && grid[i][j]!=n*(-1)) || (grid[i][j]>0 && grid[i][j]!=n) || grid[i][j]==0) {
            
            return ;
        }
        
        if(flag==1 && grid[i][j]>0)
            grid[i][j]=n*(-1);
        
        count2++;
        
       // dfs(grid, i+1, j, n);
        //dfs(grid, i, j-1, n);
        dfsHor(grid, i, j+1, n, flag);
    }
    
    public boolean moveZeroes(int[][] nums) {
        int count =0;
        for(int k=0; k<collen; k++) {
            //int[] nums = grid[][k];
            for(int i=rlen-1, j=i-1; j<=i && j>=0; ) {
              //  System.out.println(" i = "+i+" k = "+k+" nums[i][k] = "+nums[i][k]);
                if(nums[i][k]<=0) {
                   
                    while(j>=0 && nums[j][k]<=0) {
                        nums[j][k]=0;
                        j--;
                    }
                    if(j>=0) {
                        nums[i][k]=nums[j][k];
                        nums[j][k]=0;
                        count++;
                    }
                    else
                        nums[i][k]=0;
                }
                i--;
                j--;
            }
        }
        
        for(int k=0; k<collen; k++) {
            if(nums[0][k]<0)
                nums[0][k]=0;
        }
       // System.out.println(count);
        if(count==0)
            return false;
        return true;
    }
}