class Solution {
    String[] res;
    public String replaceWords(List<String> dictionary, String sentence) {
        
        Trie root = new Trie();
        for(String s:dictionary) {
            
            Trie trie = root;
            
            for(char c : s.toCharArray()) {
                int n= c-'a';
                
                if(trie.alp[n]==null){
                    trie.alp[n] = new Trie();
                }
                trie = trie.alp[n];
            }
            trie.eof = true;
        }
        res = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        replace(res, root, sb);
        return sb.substring(0, sb.length()-1);
    
    }
    
    public void replace(String[] res, Trie root, StringBuilder sb) {
        
        for(String s : res) {
            // System.out.println(s);
            Trie trie = root;
            int j=0;
            for(j=0; j<s.length(); j++) {
                char c = s.charAt(j);
                int n = c-'a';
                if(trie.alp[n]!=null) {
                    if(trie.alp[n].eof==true) {
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
    boolean eof;
    
    Trie(){}
}