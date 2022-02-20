class Solution {
    public void rotate(int[][] matrix) {
        
        int rlen = matrix.length;
        int collen = matrix[0].length;
        
        for(int k=0; k<=rlen/2; k++){
            
            int i=k;
            
        for(int j=k; j<collen-1-i; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[rlen-1-j][i];
            matrix[rlen-1-j][i] = matrix[rlen-1-i][collen-1-j];
            matrix[rlen-1-i][collen-1-j] = matrix[j][rlen-1-i];
            matrix[j][rlen-1-i] = temp;
            }
        }
    }
}