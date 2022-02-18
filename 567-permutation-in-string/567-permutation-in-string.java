class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alp1 = new int[26];
        int[] alp2 = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        
        if(len2<len1)
            return false;
        for(int i=0; i<len1; i++){
            char c1 = s1.charAt(i);
            alp1[c1-'a']++;
            char c2 = s2.charAt(i);
            alp2[c2-'a']++;
        }
        
        if(Arrays.equals(alp1, alp2))
            return true;
        
        for(int i=1, j=len1; j<len2; i++,j++){
            char ci = s2.charAt(i-1);
            alp2[ci-'a']--;
            char cj = s2.charAt(j);
            alp2[cj-'a']++;
            
            if(Arrays.equals(alp1, alp2))
                return true;
        }
        
        return false;
    }
}