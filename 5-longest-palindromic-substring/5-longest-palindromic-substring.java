class Solution {
    int len;
    int fIndex, lIndex, max =0;
    public String longestPalindrome(String s) {
        len = s.length();
        int[][] dp = new int[len][len];
        
        for(int i=0; i<len; i++)
            dp[i][i] = 1;
        
        for(int i=1; i<len; i++){
            checkForSubstrings(i, dp, s);
        }
        
        return s.substring(fIndex, lIndex+1);
    }
    
    public void checkForSubstrings(int k, int[][] dp, String s){
        
        for(int i=0; i+k<len; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+k);
            // System.out.println(c1+" i = "+i+" "+c2+" i+k = "+(i+k));
            
            if(c1==c2 && ((i < (i+k-2) && dp[i+1][i+k-1]==1) || i>=(i+k-2))){
                if(max<k){
                    fIndex = i;
                    lIndex = i+k;
                    max =k;
                    // System.out.println("fIdx = "+fIndex+" lIdx = "+lIndex+" max = "+max);
                }
                dp[i][i+k]=1;
            }
            else
                dp[i][i+k]=0;
        }
    }
}