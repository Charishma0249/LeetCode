class Solution {
    
    int maxArea=0, area=0;
    
    public int largestIsland(int[][] grid) {
        
        int rlen = grid.length, collen = grid[0].length; 
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count =2, max=0;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                area = 0;
                
                if(grid[i][j]==1) {
                    dfs(grid, rlen, collen, i, j, count);
                    hm.put(count, area);
                    max = Math.max(max, area);
                   // System.out.println(area);
                    count++;
                }
                    
            }
        }
        
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                area = 1;
                int ind1=0, ind2=0, ind3=0, ind4=0;
                if(grid[i][j]==0) {
                    if(i+1<rlen && grid[i+1][j]!=0) {
                        ind1 = grid[i+1][j];
                        area += hm.get(ind1);
                    }
                    if(j-1>=0 && grid[i][j-1]!=0 && grid[i][j-1]!=ind1) {
                        ind2 = grid[i][j-1];
                        area += hm.get(ind2);
                    }
                    if(i-1>=0 && grid[i-1][j]!=0 && grid[i-1][j]!=ind2 && grid[i-1][j]!=ind1) {
                        ind3 = grid[i-1][j];
                        area += hm.get(ind3);
                    }
                    if(j+1<rlen && grid[i][j+1]!=0 && grid[i][j+1]!=ind1 && grid[i][j+1]!=ind2 && grid[i][j+1]!=ind3) {
                        ind4 = grid[i][j+1];
                        area += hm.get(ind4);
                    }
                    
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        
        return maxArea==0?max : maxArea;
    }
    
    public void dfs(int[][] grid, int rlen, int collen, int i, int j, int count) {
        
       // System.out.println(temp);
        if(i<0 || i>=rlen || j<0 || j>=collen || grid[i][j]!=1)
            return ;
        
       // System.out.println(temp);
        grid[i][j] = count;
        
        area++;
       // System.out.println("area = "+area);
        dfs(grid, rlen, collen, i+1, j, count);
        dfs(grid, rlen, collen, i, j-1, count);
        dfs(grid, rlen, collen, i-1, j, count);
        dfs(grid, rlen, collen, i, j+1, count);
        
        //grid[i][j]=1;
    }
}