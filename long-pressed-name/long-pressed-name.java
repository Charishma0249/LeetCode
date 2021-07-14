class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int slen = name.length();
        int tlen = typed.length();
        int i,j;
        
        if(slen>tlen)
            return false;
        
        for(i=0, j=0;i<slen && j<tlen;)
        {
            char a = name.charAt(i);
            char b = typed.charAt(j);
            
            if(a==b)
            {
                i++;
                j++;
            }
            
            else
            {
                while(j>0 && j<tlen && typed.charAt(j)==typed.charAt(j-1))
                    j++;
                
                if(j<tlen && a != typed.charAt(j))
                    return false;
            }
        }
        
        if(i<slen && j>=tlen)
            return false;
        
        while(j>0 && j<tlen && typed.charAt(j)==typed.charAt(j-1))
            j++;
        
        if(j<tlen)
            return false;
        
        return true;
    }
}