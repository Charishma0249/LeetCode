class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<Character, Pair> hm = new HashMap<>();
        int wordlen = words.length;
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<wordlen; i++) {
            
            hm = findFrequency(words[i], hm);
        }
        
        for(Map.Entry<Character, Pair> entry: hm.entrySet()) {
            Pair p = entry.getValue();
            
            if(p.len < wordlen)
                continue;
            
            for(int i=0; i<p.min; i++)
                res.add(String.valueOf(entry.getKey()));
        }
        
        return res;
    }
    
    
    public HashMap<Character, Pair> findFrequency(String s, HashMap<Character, Pair> hm) {
        
        int[] alph = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            alph[c-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(alph[i]>0) {
                char c = (char)('a'+i);
                // sb.append(c);
                // sb.append(alph[i]);
                Pair p = new Pair();
                
                if(hm.containsKey(c)) {
                    p = hm.get(c);
                    if(alph[i]<p.min)
                        p.min = alph[i];
                }
                else 
                    p.min = alph[i];
                
                p.len++;
                
                hm.put(c, p);
            }
        }
        
        return hm;
    }
}

class Pair{
    int len;
    int min;
    
    public Pair() {}
    public Pair(int len, int min) {
        this.len = len;
        this.min = min;
    }
}