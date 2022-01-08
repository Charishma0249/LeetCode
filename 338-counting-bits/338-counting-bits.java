class Solution {
    int[] res;
    public int[] countBits(int n) {
        
        res = new int[n+1];
        res[0] = 0;
        if(n>0)
            res[1] = 1;
        
        double cons = Math.log(2);
        for(int i=2; i<n+1; i++) {
            if(Math.ceil(Math.log(i)/cons) == Math.floor(Math.log(i)/cons))
                res[i]=1;
            else {
                
                res[i] = res[i/2];
                if(i%2==1)
                    res[i] += 1;
            }
        }
        
        return res;
    }
}