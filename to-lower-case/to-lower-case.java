class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder sb = new StringBuilder("");
        
        
        for(char c : s.toCharArray())
        {
            int temp = c;
            
            int diff;
            if(temp>=65 && temp<=90)
            {
                diff = temp-'A';
                sb.append((char)('a'+diff));
            }
            else
                sb.append(c);
        }
        
        
        return sb.toString();
    }
}