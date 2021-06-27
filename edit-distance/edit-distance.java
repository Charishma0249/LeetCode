class Solution {
    
    int[][] optimize;
    int[][] result;
    public int minDistance(String word1, String word2) {
        
        int len1 = word1.length();
        int len2 = word2.length();
        
        optimize =new int[len1][len2];
        result = new int[len1][len2];
        
        for(int i=0;i<len1;i++)
            Arrays.fill(optimize[i], -1);
        
        if(word1.equals(word2) || (len1==0 && len2==0))
            return 0;
        
        return rec(word1, word2, 0, len1-1, len2-1);
    }
    
    public int rec(String s1, String s2, int res, int i, int j)
    {                
        int res1=0, res2=0, res3=0;
        
        if(i==-1 && j==-1)
            return res;
        
        else if(i==-1 && j>=0)
            return res+j+1;
        else if(i>=0 && j==-1)
            return res+i+1;
        
        char c1 = s1.charAt(i);
        char c2 = s2.charAt(j);
        
        if(c1==c2)
            return rec(s1, s2, res, i-1, j-1);
        
        else
        {
            if(optimize[i][j]!=-1)
                return optimize[i][j]-result[i][j]+res;
            //insert
            res1 = rec(s1, s2, res+1, i, j-1);
            
            //remove
            res2 = rec(s1, s2, res+1, i-1, j);
            
            //replace
            
            res3 = rec(s1, s2, res+1, i-1, j-1);
        }
        
      //  System.out.println("res1 = "+res1+" res2 = "+res2+" res3 = "+res3);
        int min = Math.min(res1, Math.min(res2, res3));
       // System.out.println("i="+i+" j="+j+" min="+min);
        
        optimize[i][j] = min;
        result[i][j] = res;
        
        return min;
    }
}