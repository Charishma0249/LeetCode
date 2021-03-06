class Solution {
    public boolean isRectangleOverlap(int[] r1, int[] r2) {
        
        if(r2[0]>r1[2] || r1[0]>r2[2])
            return false;
        if(r1[1]>r2[3] || r2[1]>r1[3])
            return false;
        if((r1[1]>=r2[3] && r1[1]>r2[3]) || (r2[1]>=r1[3] && r2[3]>r1[3]))
            return false;
        if((r2[0]>=r1[2] && r2[0]>r1[0]) || (r1[0]>=r2[2] && r1[0]>r2[0]))
            return false;
        
        return true;
    }
}