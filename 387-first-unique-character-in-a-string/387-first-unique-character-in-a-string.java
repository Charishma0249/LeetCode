class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;
            
            if(hm.containsKey(c))
                count = hm.get(c)+1;
            
            hm.put(c, count);
        }
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(hm.get(c)==1)
                return i;
        }
        
        return -1;
    }
}