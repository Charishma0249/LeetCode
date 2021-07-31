class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        
        int[][] arr = new int[len1+1][len2+1];
        
        for(int i=0; i<=len1;i++)
        {
            for(int j=0; j<=len2; j++)
            {
                if(i==0 && j==0)
                {
                    arr[i][j] = 0;
                    continue;
                }
                if(j==0)
                {
                    char t1 = s1.charAt(i-1);
                    arr[i][j] = arr[i-1][j]+t1;
                    continue;
                }
                if(i==0)
                {
                    char t2 = s2.charAt(j-1);
                    arr[i][j] = arr[i][j-1]+t2;
                    continue;
                }
                
                char c1 = s1.charAt(i-1);
                char c2 = s2.charAt(j-1);
                
                if(c1==c2)
                    arr[i][j] = arr[i-1][j-1];
                else
                {
                    int count1 = arr[i][j-1]+c2;
                    int count2 = arr[i-1][j]+c1;
                    arr[i][j] = Math.min(count1, count2);
                }
                
            }
        }
        
        return arr[len1][len2];
        
        
    }
}