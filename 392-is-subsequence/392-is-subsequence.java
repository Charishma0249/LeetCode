class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=0, tlen = t.length();
        for(char c:s.toCharArray()) {
            
            if(t.indexOf(c, i)!=-1) {
                i = t.indexOf(c, i)+1;
                // System.out.println(i);
            } else {
                return false;
            }
        }
        
        return true;
    }
}