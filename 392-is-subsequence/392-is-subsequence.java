class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int lastIndx = t.indexOf(c, index);
            if(lastIndx == -1)
                return false;
            index = lastIndx+1;
        }
        
        return true;
    }
}