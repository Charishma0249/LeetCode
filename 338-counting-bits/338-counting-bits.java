class Solution {
    int[] res;
    public int[] countBits(int n) {
        
        res = new int[n+1];
        res[0] = 0;
        if(n>0)
            res[1] = 1;
        
        for(int i=2; i<n+1; i++) {
            if(Math.ceil(Math.log(i)/Math.log(2)) == Math.floor(Math.log(i)/Math.log(2)))
                res[i]=1;
            else {
                if(i%2==0)
                    res[i] = res[i/2];
                else
                    res[i] = res[i/2]+1;
            }
        }
        
        return res;
    }
}