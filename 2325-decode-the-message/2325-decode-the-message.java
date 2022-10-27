class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        int val = 'a';
        String result="";
        
        for(int i=0; i<key.length(); i++) {
            
            char c = key.charAt(i);
            
            if(!hm.containsKey(c) && c!=' ') {
                hm.put(c, (char)val);
                val++;
            }
        }
        
        for(char c: message.toCharArray()) {
            if(c==' ') {
                result+=c;
            } else {
                result += hm.get(c);
            }
        }
        
        return result;
    }
}