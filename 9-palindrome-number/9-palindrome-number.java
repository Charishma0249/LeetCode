class Solution {
    public boolean isPalindrome(int x) {
        
        ArrayList<Character> al = new ArrayList<>();
        
        int n = x, m=0, k=0;
        if(x<0){
            return false;
        }
        
        while(n>0) {
            int r = n%10;
            // al.add(Character.valueOf((char)r));
            // m = (m+r)*10;
            // System.out.println(m);
            // k++;
            n = n/10;
            if(n>0) {
                m = (m+r)*10;
            } else {
                m = m+r;
            }
        }
        // System.out.println(m);
        return x==m;
//         for(int i=0, j= al.size()-1; i<j; i++, j--) {
//             if(al.get(i)!=al.get(j)) {
//                 return false;
//             }
//         }
        
//         return true;
    }
}