class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        
        for(char c:s.toCharArray()){
            
            if(c=='#' && sb.length()>0)
                sb.deleteCharAt(sb.length()-1);
            else if(c!='#')
                sb.append(c);
        }
        
        for(char c:t.toCharArray()){
            
            if(c=='#' && tb.length()>0)
                tb.deleteCharAt(tb.length()-1);
            else if(c!='#')
                tb.append(c);
        }
        
        // System.out.println(sb+" "+tb);
        return sb.toString().equals(tb.toString());
    }
}