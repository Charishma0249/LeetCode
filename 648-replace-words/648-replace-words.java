class Solution {
    String[] res;
    public String replaceWords(List<String> dictionary, String sentence) {
        
        Trie root = new Trie();
        for(int i=0; i<dictionary.size(); i++) {
            
            String s = dictionary.get(i);
            
            Trie trie = root;
            
            for(int j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                int n= c-'a';
                Trie next = new Trie();
                if(trie.alp[n]!=null){
                    next = trie.alp[n];
                }
                trie.alp[n] = next;
                trie = next;
            }
            trie.eof = 1;
        }
        res = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        replace(res, root, sb);
        return sb.substring(0, sb.length()-1).toString();
    }
    
    public void replace(String[] res, Trie root, StringBuilder sb) {
        
        for(int i=0; i<res.length; i++) {
            String s = res[i];
            // System.out.println(s);
            Trie trie = root;
            int j=0;
            for(j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                int n = c-'a';
                if(trie.alp[n]!=null) {
                    if(trie.alp[n].eof==1) {
                        // res[i] = s.substring(0, j+1);
                        sb.append(s.substring(0, j+1));
                        sb.append(" ");
                        break;
                    }
                        
                    trie = trie.alp[n];
                }
                else {
                    sb.append(s);
                    sb.append(" ");
                    break;
                }
            }
            if(j==s.length()){
                sb.append(s);
                sb.append(" ");
            }
                
        }
    }
}

class Trie{
    
    Trie[] alp = new Trie[26];
    int eof;
    
    Trie(){}
}