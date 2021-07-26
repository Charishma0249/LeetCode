class Solution {
    public int maxPower(String s) {
        
        int len = s.length();
        char c = s.charAt(0);
        int res = 1, max = 1;
        
        for(int i=1; i<len; i++)
        {
            if(c==s.charAt(i))
                res++;
            
            else
            {
                c = s.charAt(i);
                max = Math.max(res, max);
                res = 1;
            }
        }
        
        return Math.max(res, max);
    }
}