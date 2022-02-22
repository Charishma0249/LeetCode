class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<int[][]> al = new ArrayList<>();
        
        int rlen = matrix.length;
        int collen = matrix[0].length;
        
        for(int i=0; i<rlen; i++){
            for(int j=0; j<collen; j++){
                if(matrix[i][j]==0)
                    al.add(new int[][]{{i,j}});
            }
        }
        
        for(int i=0; i<al.size(); i++){
            int[][] n = al.get(i);
            Arrays.fill(matrix[n[0][0]],0);
            for(int j=0; j<rlen; j++)
                matrix[j][n[0][1]] = 0;
            // Arrays.fill(matrix[][n[1]],0);
        }
        
        // return matrix;
    }
}