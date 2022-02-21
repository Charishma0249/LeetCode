class Solution {
    public int countVowelStrings(int n) {
        int[] vowels = new int[]{'a','e','i','o','u'};
        int[][] dp = new int[n][5];
        return rec(n, 0, 0, vowels, dp);
    }
    
    public int rec(int n, int idx, int i, int[] vowels, int[][] dp){
        
        int res=0;
        if(idx==n)
            return 1;
        
        if(dp[idx][i]>0)
            return dp[idx][i];
        
        for(int j=i; j<vowels.length; j++){
            res+=rec(n, idx+1, j, vowels, dp);
        }
        dp[idx][i] = res;
        return res;
    }
}