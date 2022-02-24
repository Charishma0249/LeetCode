class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s : words){
            boolean res = isPalindrome(s);
            if(res)
                return s;
        }
        
        return "";
    }
    
    public boolean isPalindrome(String s){
        
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rev = new StringBuilder(s);
        // System.out.println(rev);
        
        if(rev.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
//         int len = s.length();
//         for(int i=0, j=len-1; i<j; i++, j--){
//             char c1 = s.charAt(i);
//             char c2 = s.charAt(j);
            
//             if(c1!=c2)
//                 return false;
//         }
        
//         return true;
    }
}