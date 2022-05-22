class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> characterMapping = new HashMap<>();
        int len = s.length();
        int maxLen = Integer.MIN_VALUE;
        
        if(len==0)
            return 0;
        
        characterMapping.put(s.charAt(0), 0);
        for(int i=0, j= i+1; i<len && j<len; j++) {
                char c = s.charAt(j);
                int diff = j-i;
                if(characterMapping.containsKey(c) && characterMapping.get(c)>=i) {
                    if(maxLen < diff) {
                        maxLen = diff;
                    }
                    i = characterMapping.get(c)+1;
                }
                else {
                    if(j==len-1 && maxLen<diff+1) {
                        maxLen = diff+1;
                    }
                }
                characterMapping.put(c, j);
                
            
        }
    return (maxLen == Integer.MIN_VALUE) ? 1 : maxLen;
    }
}