class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
       
        if(n>=1) {
            result[1] = 1;
        }
        for(int i=2; i<n+1; i++) {
            result[i] = findBits(i, result);
        }
        return result;
    }
    
    public static int findBits(int i, int[] dp) {
        
        int count =0, r=0;
        float fr = 0.0f;
        while(i>1) {
            if(dp[i]>0) {
                return count+dp[i];
            }
            r = i%2;
            
            if(r==1) {
                count++;
            }
            i = i/2;
        }
        
        return count+1;
    }
}