class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        int val = 'a';
        StringBuilder result= new StringBuilder();
        
        for(char c: key.toCharArray()) {
            
            if(!hm.containsKey(c) && c!=' ') {
                hm.put(c, (char)val);
                val++;
            }
        }
        
        for(char c: message.toCharArray()) {
            if(c==' ') {
                result.append(c);
            } else {
                result.append(hm.get(c));
            }
        }
        
        return result.toString();
    }
}