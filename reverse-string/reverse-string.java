class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length;
        int j = len-1;
        char temp;
        for(int i=0; i<len/2;i++) {
            
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            j--;
            
        }
        
    }
}