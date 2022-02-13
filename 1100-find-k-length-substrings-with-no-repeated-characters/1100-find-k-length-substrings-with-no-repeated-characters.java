class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        int[] alp = new int[26];
        int count =0;
        HashSet<Character> hs = new HashSet<>();
        
        if(k>s.length())
            return count;
        for(int i=0; i<k; i++){
            char c = s.charAt(i);
            if(alp[c-'a']==1) {
                hs.add(c);
            }
            alp[c-'a']++;
        }
        
        if(hs.size()==0)
            count++;
        
        for(int i=1, j=i+k-1; j<s.length(); i++, j++){
            char c1 = s.charAt(i-1);
            char c2 = s.charAt(j);
            
            if(c1==c2) {
                if(hs.size()==0)
                    count++;
                continue;
            }
                
            if(alp[c1-'a']-1==1){
                hs.remove(c1);
            }
            if(alp[c2-'a']==1) {
                hs.add(c2);
            }
            alp[c1-'a']--;
            alp[c2-'a']++;
            if(hs.size()==0)
                count++;
            
        }
        
        return count;
    }
}