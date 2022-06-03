class NumMatrix {

    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int rlen = matrix.length, collen = matrix[0].length;
        prefix = new int[rlen][collen];
        for(int i=0; i<rlen; i++) {
            for(int j=0; j<collen; j++) {
                prefix[i][j] = matrix[i][j];
                if(j>0) {
                    prefix[i][j] += prefix[i][j-1];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        
        int sum=0;
        for(int i=row1; i<=row2; i++) {
            sum +=prefix[i][col2];
            if(col1>0) {
                sum = sum-prefix[i][col1-1];
            }
        }
        
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */