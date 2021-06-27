class Solution {
    
    StringBuilder res = new StringBuilder();
    public String reverseWords(String s) {
        
        LinkedList<String> ll = new LinkedList<>();
        
        int len = s.length();
        
        for(int i=0;i<len;i++)
        {
            
            char c = s.charAt(i);
            if(c==' ')
            {
                continue;
            }
            
            int j=i;
            while(c!=' ' && i<len-1)
            {
                i++;
                c=s.charAt(i);
            }
            
            if(i==len-1)
                ll.add(s.substring(j,i+1));
            else
                ll.add(s.substring(j,i));
        }
        
        for(int i=ll.size()-1;i>=0;i--)
        {
            res.append(ll.get(i));
            
            if(i!=0)
                res.append(" ");
        }
        
        return res.toString();
            
    }
}