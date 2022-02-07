class Solution {
    int left=0, right=0;
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
            right++;
            if(right>left){
                sb.deleteCharAt(i);
                right--;
                i--;
            }
        }
            
        if(i<sb.length()) {
            rec(sb, i+1);
        if(i>=0 && sb.charAt(i)=='(' && left>right){
            sb.deleteCharAt(i);
            left--;
        }
        }
    }
}