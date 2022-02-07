class Solution {
    int left=0;
    public String minRemoveToMakeValid(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        rec(sb, 0);
        return sb.toString();
    }
    
    public void rec(StringBuilder sb, int i){
        
        if(i==sb.length())
            return ;
        
        if(sb.charAt(i)=='(')
            left++;
        if(sb.charAt(i)==')') {
            left--;
            if(left<0){
                sb.deleteCharAt(i);
                left++;
                i--;
            }
        }
            
        if(i<sb.length()) {
            rec(sb, i+1);
        if(i>=0 && sb.charAt(i)=='(' && left>0){
            sb.deleteCharAt(i);
            left--;
        }
        }
    }
}