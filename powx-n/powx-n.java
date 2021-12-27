class Solution {
    public double myPow(double x, int n) {
        
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(x==1 || x==-1 && n%2==0)
            return 1;
        if(x==-1 && n%2==1)
            return x;
        
        int m = n;
        double res = 1;
        if(n<0) {
            if(n==Integer.MIN_VALUE)
                m = Integer.MAX_VALUE;
            else
                m = n*(-1);
        }
        
       // System.out.println(m);
        for(int i=0; i<m/2; i++) {
            res*=x;
            if(n<0) {
                double y = 1/res;
                if(y==0)
                    return 0;
            }
        }
        
        if(m%2==0)
            res*=res;
        else
            res*=res*x;
        
        if(n==Integer.MIN_VALUE)
            res*=x;
        
       // System.out.println(res);
        if(n<0)
            return (double)(1/res);
        return res;
    }
}