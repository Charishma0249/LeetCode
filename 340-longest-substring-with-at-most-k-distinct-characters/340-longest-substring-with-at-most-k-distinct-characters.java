class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length(), counter=0, maxCount = 0;
        int i=0, j=0;
        
        if(k==0)
            return 0;
        
        for(i=0, j=0; i<=j && j<len; j++) {
            
            char c = s.charAt(j);
            if(hm.containsKey(c) && hm.get(c)>0) {
                hm.put(c, hm.get(c)+1);
            }
            else {
                if(counter<k) {
                    counter++;
                }
                else {
                    maxCount = Math.max(maxCount, j-i);
                    while(i<j) {
                        char c1 = s.charAt(i);
                        hm.put(c1, hm.get(c1)-1);
                        i++;
                        if(hm.get(c1)==0) {
                            break;
                        }
                    }
                }
                hm.put(c, 1);
            }
        }
        
        return Math.max(maxCount, j-i);
    }
}