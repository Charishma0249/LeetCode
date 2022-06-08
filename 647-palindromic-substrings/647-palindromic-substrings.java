class Solution {
    public int countSubstrings(String s) {
        
        int len = s.length();
        int[][] dp = new int[len][len];
        int count = 0;
        
        // for(int i=0; i<len; i++) {
        //     dp[i][i] = 1;
        // }
        
        for(int k=1; k<len; k++) {
            for(int i=0; i+k<len; i++) {
                
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+k);
                if(c1==c2 && ((dp[i+1][i+k-1] == 1) || (i+1==i+k) || (i+1==i+k-1))) {
                    count++;
                    dp[i][i+k] = 1;
                }
            }
        }
        
        return count+len;
    }
}