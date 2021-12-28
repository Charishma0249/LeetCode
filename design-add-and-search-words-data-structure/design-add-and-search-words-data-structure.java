class WordDictionary {

    Trie trie;
    public WordDictionary() {
        trie = new Trie();
    }
    
    public void addWord(String word) {
       // Trie temp = new Trie();
        Trie temp = trie;
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            //HashMap<Character, Trie> hm = new HashMap<>();
            Trie tr = new Trie();
            //System.out.println(temp);
            if(temp.hm.containsKey(c)) {
                tr = temp.hm.get(c);
            }
            else
                tr.eow=0;
            
            temp.hm.put(c, tr);
            temp = tr;
        }
        temp.eow = 1;
    }
    
    public boolean search(String word) {
        
        Trie temp = trie;
        return rec(word, temp, 0);
    }
    
    public boolean rec(String word, Trie trie, int i) {
        
        if(i>=word.length()) {
            if(trie.eow!=1)
                return false;
            return true;
        }
        
        char c = word.charAt(i);
        if(c=='.') {
            boolean res;
            for(Map.Entry<Character, Trie> entry : trie.hm.entrySet()) {
                
                Trie nextTrie = entry.getValue();
                res = rec(word, nextTrie, i+1);
                if(res==true)
                    return true;
            }
            return false;
        }
        else if(!trie.hm.containsKey(c)) 
            return false;
        
        return rec(word, trie.hm.get(c), i+1);
    }
}

class Trie {
    char c;
    HashMap<Character, Trie> hm = new HashMap<>();
    int eow;
    
    public Trie() {}
    
    public Trie(char c, HashMap<Character, Trie> hm, int eow) {
        this.c = c;
        this.hm = hm;
        this.eow = eow;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */