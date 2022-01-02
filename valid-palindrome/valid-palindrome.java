class Solution {
    public boolean isPalindrome(String s) {
        
        String s1 = s.toLowerCase();
        
        ArrayList<Character> al = new ArrayList<>();
        int len = s1.length();
        
        for(int i=0; i<len; i++) {
            char c = s1.charAt(i);
            //System.out.println(c);
            if(c>='a' && c<='z' || c>='0' && c<='9')
                al.add(c);
        }
        
        for(int i=0, j=al.size()-1; i<j; i++, j--) {
            if(al.get(i)!=al.get(j))
                return false;
        }
        
        return true;
    }
}