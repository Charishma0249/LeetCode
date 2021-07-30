class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int len1 = text1.length();
        int len2 = text2.length();
       
        int[][] arr = new int[len2+1][len1+1];
        
        for(int i=0; i<len2+1; i++)
        {
            for(int j=0; j<len1+1; j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j]=0;
                    continue;
                }
                
                
                char c1 = text1.charAt(j-1);
                char c2 = text2.charAt(i-1);
                if(c1==c2)
                    arr[i][j]=1+arr[i-1][j-1];
                else
                {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }
        
        return arr[len2][len1];
            
    }
}