class Solution {
    public int removePalindromeSub(String s) {
        
        boolean isPalindrome = true;
        
        for(int i=0, j=s.length()-1; i<j; i++, j--) {
            
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            
            if(c1!=c2) {
                return 2;
            }
        }
        
        return 1;
    }
}