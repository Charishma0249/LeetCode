class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alp1 = new int[26];
        int[] alp2 = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        
        if(len2<len1)
            return false;
        for(char c:s1.toCharArray())
            alp1[c-'a']++;
        
        for(int i=0; i<len1; i++){
            char c = s2.charAt(i);
            alp2[c-'a']++;
        }
        boolean flag=false;
        for(int k=0; k<26; k++){
                if(alp1[k]!=alp2[k]){
                    flag =true;
                    break;
                }
                    
            }
        if(!flag)
            return true;
        for(int i=1, j=len1; j<len2; i++,j++){
            char ci = s2.charAt(i-1);
            alp2[ci-'a']--;
            char cj = s2.charAt(j);
            alp2[cj-'a']++;
            
            flag=false;
            for(int k=0; k<26; k++){
                if(alp1[k]!=alp2[k]){
                    flag =true;
                    break;
                }
                    
            }
            if(!flag)
                return true;
        }
        
        return false;
    }
}