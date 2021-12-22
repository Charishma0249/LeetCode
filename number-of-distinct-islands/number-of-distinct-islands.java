class Solution {
    public int numDistinctIslands(int[][] grid) {
        
        int rlen = grid.length, collen = grid[0].length;
        int count =0;
        HashSet<String> hs = new HashSet<>();
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(grid[i][j]==1) {
                    StringBuilder sb = new StringBuilder();
                    sb = findDistinctIsland(i, j, rlen, collen, grid, sb, "i*j*");
                    //System.out.println(sb);
                    String s = sb.toString();
                    
                    if(!hs.contains(s)) {
                        hs.add(s);
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    public StringBuilder findDistinctIsland(int i, int j, int rlen, int collen, int[][] grid, StringBuilder sb, String path) {
        
        if(i<0 || i>=rlen || j<0 || j>=collen || grid[i][j]!=1) {
            sb.append("/");
            return sb;
        }
        
        grid[i][j]=-1;
        sb.append(path);
        
        findDistinctIsland(i+1, j, rlen, collen, grid, sb, "i+1*j*");
        findDistinctIsland(i, j-1, rlen, collen, grid, sb, "i*j-1*");
        findDistinctIsland(i-1, j, rlen, collen, grid, sb, "i-1*j*");
        findDistinctIsland(i, j+1, rlen, collen, grid, sb, "i*j+1*");
        
        return sb;
    }
}