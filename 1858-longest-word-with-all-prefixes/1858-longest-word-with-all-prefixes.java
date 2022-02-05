class Solution {
    String res = "";
    public String longestWord(String[] words) {
       
        
        Trie root = new Trie();
        for(int i=0; i<words.length; i++) {
            String s = words[i];
            Trie trie = root;
            for(int j=0; j<s.length(); j++) {
                int c = s.charAt(j)-'a';
                Trie next = new Trie();
                if(trie.alp[c]!=null)
                    next = trie.alp[c];
                
                trie.alp[c] = next;
                trie = next;
            }
            trie.eof = 1;
        }
        
        findPrefix(root, new StringBuilder());
        
        // return (pq.isEmpty()) ? "" : pq.poll(); 
        return res;
    }
    
    public void findPrefix(Trie trie, StringBuilder sb) {
        int count=0;
        for(int i=0; i<26; i++) {
            if(trie.alp[i]!=null) {
                if(trie.alp[i].eof==1) {
                    sb.append((char)('a'+i));
                    findPrefix(trie.alp[i], sb);
                    sb.deleteCharAt(sb.length()-1);
                }
               
                
            }
            else if(count!=1 && trie.eof==1){
                    
                    if(res.length()<sb.length())
                        res = sb.toString();
                    
                    count++;
                }
                
        }
    
    }
}

public class Trie {
    Trie[] alp = new Trie[26];
    int eof = 0;
    
    public Trie() {
        
    }
}