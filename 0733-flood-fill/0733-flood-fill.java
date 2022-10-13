class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int rlen = image.length;
        int collen = image[0].length;
        
        if(image[sr][sc]==color) 
            return image;
        
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                
                if(sr == i && sc == j) {
                    dfs(image, i, j, rlen, collen, image[sr][sc], color);
                }
            }
        }
        
        return image;
    }
    
    public void dfs(int[][] grid, int i, int j, int rlen, int collen, int baseColor, int color) {
        
        if(i<0 || j<0 || i>=rlen || j>=collen || grid[i][j]!=baseColor) {
            return ;
        }
        
        grid[i][j] = color;
        
        dfs(grid, i+1, j, rlen, collen, baseColor, color);
        dfs(grid, i, j-1, rlen, collen, baseColor, color);
        dfs(grid, i-1, j, rlen, collen, baseColor, color);
        dfs(grid, i, j+1, rlen, collen, baseColor, color);
    }
}