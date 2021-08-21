class Solution {
    int len, count =0;
    public int countLetters(String s) {
        
        len = s.length();
        
        for(int i=0; i<len; i++)
        {
            count++;
            rec(i+1, s);
        }
        
        return count;
    }
    
    public void rec(int i, String s)
    {
        if(i>=len)
            return ;
        
        if(s.charAt(i)==s.charAt(i-1))
        {
            count++;
            rec(i+1, s);
        }
        else
            return ;
    }
}