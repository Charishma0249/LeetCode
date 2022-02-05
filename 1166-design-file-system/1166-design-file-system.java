class FileSystem {

    Trie root;
    public FileSystem() {
        root = new Trie();
    }
    
    public boolean createPath(String path, int value) {
        Trie trie = root;
        String[] str = path.split("/");
        int j=0;       
         // System.out.println(str.length);
        for(String s : str) {
            if(s.equals("") || s.equals(" ")) {
                j++;
                continue;
            }
              // System.out.println("Hey-- "+s);
            if(trie.hm.containsKey(s))
                trie = trie.hm.get(s);
            else if(!trie.hm.containsKey(s) && j==str.length-1) {
                Trie next = new Trie();
                trie.hm.put(s, next);
                trie.val.put(s, value);
                trie = trie.hm.get(s);
                trie.eof = true;
                return true;
            }
            else if(!trie.hm.containsKey(s) && j!=str.length-1)
                return false;
            j++;
        }
        return false;
    }
    
    public int get(String path) {
        Trie trie = root;
        String[] str = path.split("/");
        int value =-1;
        for(String s : str) {
            if(s.equals(""))
                continue;
            // System.out.println(s);
            if(!trie.hm.containsKey(s))
                return -1;
            
            value = trie.val.get(s);
            trie = trie.hm.get(s);
        }
        
        if(trie.eof)
            return value;
        return -1;
    }
}

class Trie{
    HashMap<String, Trie> hm = new HashMap<>();
    HashMap<String, Integer> val = new HashMap<>();
    boolean eof;
}
/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */