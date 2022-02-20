class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] alp = new int[26];
        int prev=-1;
        
        for(char c:s.toCharArray()){
            alp[c-'a']++;
        }
        for(int i=0; i<26; i++){
            if(alp[i]>0){
                if(prev==-1)
                    prev = alp[i];
                else if(prev!=-1 && alp[i]!=prev)
                    return false;
            }
        }
        
        return true;
    }
}