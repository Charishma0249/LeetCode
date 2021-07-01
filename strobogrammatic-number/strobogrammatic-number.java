class Solution {
    public boolean isStrobogrammatic(String s) {
        
        int len = s.length();
        for(int i=0, j=len-1;i<len;i++)
        {
            
            int c = s.charAt(i);
            
            int n = len-1-i;
            int cr = s.charAt(n);
            if(c==cr && (c=='1' || c=='8' || c=='0'))
                continue;
            
            if((c=='6' && cr=='9') || (c=='9' && cr=='6'))
                continue;
            
            else 
                return false;
        }
        
        return true;
    }
}