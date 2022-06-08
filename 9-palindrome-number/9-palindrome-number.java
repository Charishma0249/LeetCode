class Solution {
    public boolean isPalindrome(int x) {
        
        ArrayList<Character> al = new ArrayList<>();
        
        int n = x;
        if(x<0){
            // al.add("-");
            // n = x*(-1);
            return false;
        }
        
        while(n>0) {
            int r = n%10;
            al.add(Character.valueOf((char)r));
            n = n/10;
        }
        
//         if(x<0) {
//             al.add('-');
//         }
        
        // System.out.println(al);
        for(int i=0, j= al.size()-1; i<j; i++, j--) {
            if(al.get(i)!=al.get(j)) {
                return false;
            }
        }
        
        return true;
    }
}