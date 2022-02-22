class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rlen = matrix.length;
        int collen = matrix[0].length;
        boolean res=false;
        
        for(int i=0; i<rlen; i++){
            res = binSearch(matrix, i, target, 0, collen);
            if(res)
                return res;
        }
        
        return res;
    }
    
    public boolean binSearch(int[][] grid, int i, int target, int low, int high){
        
        if(low>=high)
            return false;
        
        int mid = (high+low)/2;
        boolean res=false;
        
        if(target==grid[i][mid])
            return true;
        else if(target<grid[i][mid])
            res = res || binSearch(grid, i, target, low, mid);
        else
            res = res || binSearch(grid, i, target, mid+1, high);
        
        return res;
    }
        
}