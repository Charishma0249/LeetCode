class Solution {
    public int maxPower(String s) {
        
        int temp = 1;
        int len = s.length();
        int count = 0;
        
        for(int i=1; i<len; i++) {
            
            int c1 = s.charAt(i-1)-'a';
            int c2 = s.charAt(i)-'a';
            
            if(c1==c2) {
                temp++;
            }
            else {
                count = Math.max(count, temp);
                temp=1;
            }
        }
        
        count = Math.max(count, temp);
        
        
        return count;
    }
}