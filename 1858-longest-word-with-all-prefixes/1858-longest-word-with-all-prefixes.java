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
                // System.out.println(i);
                if(trie.alp[i].eof==1) {
                    // s += (char)('a'+i);
                    sb.append((char)('a'+i));
                    // System.out.println(s);
                    // pq.add(sb.toString());
                    findPrefix(trie.alp[i], sb);
                    sb.deleteCharAt(sb.length()-1);
                }
               
                
            }
            else if(count!=1 && trie.alp[i]==null && trie.eof==1){
                    String s = sb.toString();
                    if(res.length()<s.length())
                        res = s;
                    
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