class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        int[][] dp = new int[len1+1][len2+1];
        int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums1.length; i++){
        //     dp[i][0] = 0;
        // }
        // for(int i=0; i<nums2.length; i++){
        //     dp[0][i]=0;
        // }
        // System.out.println(dp[0][0]);
        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                if(nums1[i]==nums2[j]) {
                    // System.out.println("n[i] = "+nums1[i]+" n[j] = "+nums2[j]);
                    dp[i+1][j+1]=1+dp[i][j];
                    max = Math.max(max, dp[i+1][j+1]);
                }
               
            }
        }
        if(nums1[len1-1]==nums2[len2-1])
            max = Math.max(max, dp[len1][len2]);
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}