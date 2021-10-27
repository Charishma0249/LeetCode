class Solution {
    public int consecutiveNumbersSum(int N) {
        
        int n=2, count=1;
        long x = 2*N-(n*n)+n;
        
        while(x>0) {
            
            double i = (double)x/(2*n);
            
            long j=(long)i;
            if(j-i==0) {
               // System.out.println(x);
                count++; 
            }
            n++;
            x = 2*N-(n*n)+n;
        }
        
        return count;
    }
}