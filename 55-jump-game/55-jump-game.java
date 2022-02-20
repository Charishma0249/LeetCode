class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int res = rec(nums, 0, dp);
        
        return (res==1)?true : false;
    }
    
    public int rec(int[] n, int i, int[] dp){
        
        boolean res=false;
        if(i==n.length-1)
            return 1;
        if(i>n.length || (i<n.length && n[i]==0))
            return 0;
        
        if(dp[i]>=0)
            return dp[i];
        for(int j=1; j<=n[i]; j++){
            dp[i] = rec(n, i+j, dp);
            if(dp[i]==1)
                return 1;
        }
        
        return 0;
    }
}