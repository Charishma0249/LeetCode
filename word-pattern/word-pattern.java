class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> hmp = new HashMap<>();
        HashMap<String, Character> hms = new HashMap<>();
        
        String[] words = s.split(" ");
        
        if(words.length != pattern.length())
            return false;
        
        for(int i=0; i<pattern.length(); i++) {
            char p = pattern.charAt(i);
            
            if(!hmp.containsKey(p) && !hms.containsKey(words[i])) {
                hmp.put(p, words[i]);
                hms.put(words[i],p);
                continue;
            }
            else if(hmp.containsKey(p) && hms.containsKey(words[i])){
                if(hmp.get(p).equals(words[i]))
                    continue;
            }
            return false;
        }
        
        return true;
    }
}