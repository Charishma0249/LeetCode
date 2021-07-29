import java.math.*;
class Solution {
    public int trailingZeroes(int n) {
        
        int count1=0, count2=0;
        
        for(int i=n ; i>1;i--)
        {
            int temp = i;
            while(temp>1 && temp%5==0)
            {
                count1++;
                temp=temp/5;
            }
            temp=i;
            while(temp>1 && temp%2==0)
            {
                count2++;
                temp=temp/2;
            }
        }
        
        return Math.min(count1, count2);
    }
    

}