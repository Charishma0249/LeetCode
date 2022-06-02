class Solution {
    public int characterReplacement(String s, int k) {
        
        int len = s.length();
        int count=0, maxCount = 0;
        int[] alp = new int[26];
        
        for(int i=0, j=0; i<=j && j<len; j++) {
            char c = s.charAt(j);
            alp[c-'A']++;
            
            count = Math.max(count, alp[c-'A']);
            
            if(j-i+1-count>k){
                while(j-i+1-count>k) {
                    char c1 = s.charAt(i);
                    alp[c1-'A']--;
                    count = Math.max(count, alp[c1-'A']);
                    i++;
                }
            }
            
            maxCount = Math.max(maxCount, j-i+1);
        }
        
        return maxCount;
    }
}