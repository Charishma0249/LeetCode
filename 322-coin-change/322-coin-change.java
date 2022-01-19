class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0)
            return 0;
        
        int[] dp = new int[amount+1];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for(int i=1; i<=amount; i++) {
            
            for(int j=0; j<coins.length; j++) {
                
                if(coins[j]<=i) {
                    int diff = i-coins[j];
                    if(dp[diff]==Integer.MAX_VALUE)
                        continue;
                    dp[i] = Math.min(dp[i], 1+dp[diff]);
                }
            }
            // if(dp[i]==Integer.MAX_VALUE)
            //     dp[i] = -1;
        }
        
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}