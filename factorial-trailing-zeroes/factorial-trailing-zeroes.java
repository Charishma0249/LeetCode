import java.math.*;
class Solution {
    public int trailingZeroes(int n) {
        
        int count1=0;
            
        while(n>0)
        {
           n=n/5;
           count1+=n;
        }
            
        
        return count1;
    }
    

}