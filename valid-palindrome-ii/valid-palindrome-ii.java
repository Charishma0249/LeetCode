class Solution {
    public boolean validPalindrome(String s) {
        
        int len = s.length();
        int flag=1;
        
        for(int i=0, j=len-1; i<j; ) {
            
            char startChar = s.charAt(i);
            char endChar = s.charAt(j);
           // System.out.println(" i = "+i+" j = "+j);
            if(startChar == endChar) {
                i++;
                j--;
            }
            else {
                boolean b1 = checkPalindrome(s, i+1, j);
                boolean b2 = checkPalindrome(s, i, j-1);
                
                return b1||b2;
            }
        }
        
        return true;
    }
    
    public boolean checkPalindrome(String s, int i, int j) {
        
        while(i<j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            else{
                i++;
                j--;
            }  
        }
        
        return true;
    }
}