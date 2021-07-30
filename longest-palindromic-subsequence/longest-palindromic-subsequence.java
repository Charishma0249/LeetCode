class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int len = s.length();
        
        int[][] arr = new int[len+1][len+1];
        
        for(int i=0; i<len+1; i++)
        {
            for(int j=0; j<len+1; j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j]=0;
                    continue;
                }
                
                char c1 = s.charAt(i-1);
                char c2 = s.charAt(len-j);
                
                if(c1==c2)
                    arr[i][j] = arr[i-1][j-1]+1;
                else
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
            }
        }
        
        return arr[len][len];
    }
}