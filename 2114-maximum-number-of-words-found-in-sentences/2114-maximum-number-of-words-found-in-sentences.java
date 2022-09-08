class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for(String s:sentences) {
            
            // String[] str = s.split("\\s+");
            int len = 1;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i)==' ') {
                    len++;
                }
            }
            max = Math.max(max, len);
        }
        
        return max;
    }
}