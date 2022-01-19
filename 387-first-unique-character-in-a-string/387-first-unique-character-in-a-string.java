class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;
            
            if(hm.containsKey(c))
                count = hm.get(c)+1;
            
            hm.put(c, count);
        }
        
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            
            int count = entry.getValue();
            if(count==1)
                return s.indexOf(entry.getKey());
        }
        
        return -1;
    }
}