/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int row, int col) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        
        List<Integer> dimension = binaryMatrix.dimensions();
        int rowLen = dimension.get(0), colLen = dimension.get(1);
        int res = Integer.MAX_VALUE;
        
        for(int i=0; i<rowLen; i++) {
            int indx = binSearch(0,colLen-1, binaryMatrix, i,-1);
           // System.out.println(indx);
            if(indx!=-1) 
                res = Math.min(res, indx);       
        }
        
        return res==Integer.MAX_VALUE ? -1 : res;
    }
    
    public int binSearch(int low, int high, BinaryMatrix binaryMatrix, int i, int result) {
        
        if(low>high)
            return result;
        int mid = low+(high-low)/2;
        //System.out.println("l = "+low+" h = "+high+" mid = "+mid);
        if(binaryMatrix.get(i, mid)==0)
            return binSearch(mid+1, high, binaryMatrix, i, result);
        else {
            result = mid;
           // System.out.println("res = "+result);
            return binSearch(low, mid-1, binaryMatrix, i, result);
        }
    }
}