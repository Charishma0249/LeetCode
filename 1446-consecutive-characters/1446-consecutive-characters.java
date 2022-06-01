class Solution {
    public int maxPower(String s) {
        
        int[] alp = new int[26];
        // alp[s.charAt(0)-'a']++;
        int temp = 1;
        int len = s.length();
        
        for(int i=1; i<len; i++) {
            
            int c1 = s.charAt(i-1)-'a';
            int c2 = s.charAt(i)-'a';
            
            if(c1==c2) {
                temp++;
            }
            else {
                alp[c1] = Math.max(alp[c1], temp);
                temp=1;
            }
        }
        
        alp[s.charAt(len-1)-'a'] = Math.max(alp[s.charAt(len-1)-'a'], temp);
        int count=0;
        
        for(int c : alp) {
            count = Math.max(count, c);
        }
        
        return count;
    }
}