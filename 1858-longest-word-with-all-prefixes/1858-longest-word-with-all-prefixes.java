class Solution {
    PriorityQueue<String> pq;
    List<String> al;
    public String longestWord(String[] words) {
        al = new ArrayList<>();
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
        
        // System.out.println("hey");
        Trie root = new Trie();
        Arrays.sort(words);
        for(int i=0; i<words.length; i++) {
            // System.out.println("hey");
            String s = words[i];
            Trie trie = root;
            int count=0;
             // System.out.println("word = "+words[i]);
            for(int j=0; j<s.length(); j++) {
                // System.out.println(s.charAt(j));
                int c = s.charAt(j)-'a';
                Trie next = new Trie();
                if(trie.alp[c]!=0)
                    next = trie.next;
                
                if(next.eof==0)
                    count++;
                trie.alp[c] = 1;
                trie.next = next;
                trie = trie.next;
            }
            trie.eof = 1;
             // System.out.println(count);
            if(count==1)
                pq.add(s);
        }
        
        // findPrefix(root, "");
        
        return (pq.isEmpty()) ? "" : pq.poll(); 
    }
    
//     public void findPrefix(Trie trie, String s) {
        
//         for(int i=0; i<26; i++) {
//             if(trie.alp[i]==1) {
//                 if(trie.next.eof==1) {
//                     s += 'a'+i;
//                     if(!al.isEmpty())
//                         al.set(al.size()-1, s);
//                     else
//                         al.add(s);
//                     findPrefix(trie.next);
                    
//                 }
//                 else
//             }
//         }
//     }
}

public class Trie {
    int[] alp = new int[26];
    int eof = 0;
    Trie next;
    
    public Trie() {
        
    }
    // public Trie(int[] alp, int eof, Trie trie){
    //     this.alp = alp;
    //     this.eof = eof;
    //     this.next = trie;
    // }
}