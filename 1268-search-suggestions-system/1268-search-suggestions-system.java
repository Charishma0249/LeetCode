class Solution {
    List<List<String>> res = new ArrayList<>();
    int count=0;
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        int plen = products.length;
        Trie trie = new Trie();
        
        for(int i=0; i<plen; i++) {
            String s = products[i];
            
            Trie temp = trie;
            
            putInTrie(s, temp);
        }
        
        int i = recommendWords(trie, searchWord);
        if(i<searchWord.length()) {
            for(int j=i; j<searchWord.length();j++)
                res.add(new ArrayList<>());
        }
        return res;
    }
    
    public void putInTrie(String s, Trie trie) {
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            Trie next = new Trie();
            
            if(trie.alp[c-'a'] != null)
                next = trie.alp[c-'a'];
            else
                trie.alp[c-'a'] = next;
            
            trie = next;
        }
        trie.eow = 1;
    }
    
    public int recommendWords(Trie trie, String word) {
        
        StringBuilder sb = new StringBuilder();
        int i=word.length();
        for(i=0; i<word.length(); i++) {
            
            List<String> al = new ArrayList<>();
            char c = word.charAt(i);
            
            if(trie.alp[c-'a']!=null) {
                Trie next = trie.alp[c-'a'];
                count =0;
                sb.append(c);
                findWords(next, al, sb);
                trie=next;
            }
            else
                return i;
            
            res.add(al);
        }
        
        return i;
    }
    
    public void findWords(Trie next, List<String> al, StringBuilder sb) {
        
        if(count!=3 && next.eow==1) {
            al.add(new String(sb.toString()));
            count++;
        }
        if(count==3)
            return;
        for(int i=0; i<26; i++) {
            if(next.alp[i]!=null) {
                sb.append((char)('a'+i));
                findWords(next.alp[i], al, sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}

class Trie{
    Trie[] alp = new Trie[26];
    int eow;
    
    public Trie() {}
}