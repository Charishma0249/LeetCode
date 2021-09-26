class Solution {
    public String reverseWords(String s) {
        
        String[] strArr= s.split("\\s+");
        int len = strArr.length;
        
        for(int i=0; i<len; i++) {
            
            char[] c = strArr[i].toCharArray();
            int k = c.length-1;
            
            for(int j=0; j<c.length/2; j++) {
                
                char temp = c[j];
                c[j] = c[k];
                c[k] = temp;
                k--;
            }
            
            strArr[i]=String.valueOf(c);
            
        }
        
        return String.join(" ", strArr);
    }
}