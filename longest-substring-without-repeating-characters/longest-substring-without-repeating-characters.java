class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int res=0;
        int len = s.length();
        if(len<=1)
            return len;
        
        hm.put(s.charAt(0), 0);
        int i,j;
        
        for(i=0,j=i+1; i<len && j<len; ) {
            
           // char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(hm.containsKey(cj)) {
                res = Math.max(res, j-i);
                if(i<=hm.get(cj))
                    i = 1+hm.get(cj);
            }
            
            hm.put(cj, j);
            j++;
        }
        
        if(j==len)
            res = Math.max(res, j-i);
        
       // return res==0 ? len : res;
        return res;
    }
}