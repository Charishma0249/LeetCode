class Solution {
    List<String> res;
    public List<String> removeSubfolders(String[] folder) {
        
        res = new ArrayList<>();
        Trie root = new Trie();
        
        for(int i=0; i<folder.length; i++) {
            // String s = folder[i];
            String[] temp = folder[i].split("/");
            Trie trie = root;
            
            for(int j=0; j<temp.length; j++) {
                if(temp[j].equals(""))
                    continue;
                // System.out.println(temp[j]);
                Trie next = new Trie();
                if(trie.alp.containsKey(temp[j]))
                    next = trie.alp.get(temp[j]);
                
                trie.alp.put(temp[j], next);
                trie = next;
            }
            trie.eof=1;
        }
        
        removeSubfolder(root, new StringBuilder());
        return res;
    }
    
    public void removeSubfolder(Trie trie, StringBuilder sb) {
        
        for(Map.Entry<String, Trie> entry : trie.alp.entrySet()) {
            
            String s = entry.getKey();
            Trie next = entry.getValue();
            sb.append("/");
            sb.append(s);
            if(next.eof==1) {
                res.add(sb.toString());
            }
            else {
                removeSubfolder(next, sb);
            }
            int len = sb.length();
            for(int i=0; i<=s.length(); i++) 
                sb.deleteCharAt(len-i-1);
            
        }
    }
}

class Trie{

    HashMap<String, Trie> alp = new HashMap<>();
    int eof;
    
    Trie(){}
}