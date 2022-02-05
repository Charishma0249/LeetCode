class Solution {
    PriorityQueue<String> pq;
    public String longestWord(String[] words) {
        pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(String s1, String s2){
                
                if(s2.length()>s1.length())
                    return 1;
                else if(s2.length()<s1.length())
                    return -1;
                else {
                    if(s1.compareToIgnoreCase(s2)>0)
                        return 1;
                    else if(s1.compareToIgnoreCase(s2)<0)
                        return -1;
                    return 0;
                }
            }
        });
        
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
        
        return (pq.isEmpty()) ? "" : pq.poll(); 
    }
    
    public void findPrefix(Trie trie, StringBuilder sb) {
        
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
            else{
                // System.out.println(sb.toString());
                pq.add(sb.toString());
            }
                
        }
    }
}

public class Trie {
    Trie[] alp = new Trie[26];
    int eof = 0;
    
    public Trie() {
        
    }
    // public Trie(int[] alp, int eof, Trie trie){
    //     this.alp = alp;
    //     this.eof = eof;
    //     this.next = trie;
    // }
}