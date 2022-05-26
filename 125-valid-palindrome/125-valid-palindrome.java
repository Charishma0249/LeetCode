class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        
        int len = str.length();
        
        for(int i=0, j=len-1; i<=j; ) {
            
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(((c1>='0' && c1<='9') || (c1>='a' && c1<='z')) && ((c2>='0' && c2<='9') || (c2>='a' && c2<='z'))) {
                // System.out.println("Hello"+c1+"--hi"+c2+"--");
               if(c1==c2) {
                   i++;
                   j--;
               }
                else {
                    return false;
                }
                // System.out.println("oolalai= "+i+" j = "+j);
            }
            else {
                // System.out.println("Hey"+c1+"--hi"+c2+"--");
                if(!(c1>='0' && c1<='9') && !(c1>='a' && c1<='z')) {
                    i++;
                }
                if(!(c2>='0' && c2<='9') && !(c2>='a' && c2<='z')) {
                    // System.out.println("Hey"+c2+"--hi");
                    j--;
                }
                // System.out.println(" i= "+i+" j = "+j);
            }
        }
        
        return true;
    }
}