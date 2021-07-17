/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    long res;
    public int firstBadVersion(int n) {
        
        binarySearch(1, n);
        
        return (int)res;
    }
    
    public void binarySearch(long i, long j)
    {
        
        if(i>=j && isBadVersion((int)i))
        {
            res = i;
            return ;
        }
        

        long mid = (i+j)/2;
        if(isBadVersion((int)mid)==false)
            binarySearch(mid+1, j);
        else
            binarySearch(i, mid-1);
        
    }
    
}