class Solution {
    public int minDistance(String word1, String word2) {
        
        int len1 = word1.length();
        int len2 = word2.length();
        
        int[][] arr = new int[len1+1][len2+1];
        
        for(int i=0; i<len1+1; i++)
        {
            for(int j=0; j<len2+1; j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j]=0;
                    continue;
                }
                
                char c1 = word1.charAt(i-1);
                char c2 = word2.charAt(j-1);
                
                if(c1==c2)
                    arr[i][j] = arr[i-1][j-1]+1;
                else
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
            }
        }
        
        return len1+len2-2*arr[len1][len2];
    }
}