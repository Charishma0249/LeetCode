class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Pair> stk = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
//         LinkedList<Character> ll = new LinkedList<>();
        
//         for(int i=0; i<s.length(); i++) 
//             ll.add(s.charAt(i));
        
        for(int i=0; i<sb.length(); ) {
            
            char c = sb.charAt(i);
            if(c==')') {
                if(!stk.empty()) {
                    stk.pop();
                    i++;
                }
                else {
                   // ll.remove(i);
                    sb.deleteCharAt(i);
                }
            }
            else if(c=='(') {
                stk.push(new Pair('(',i));
                i++;
            }
            else
                i++;
        }
        
        while(!stk.empty()) {
            Pair p = stk.pop();
            //ll.remove(p.pos);
            sb.deleteCharAt(p.pos);
        }
        
        //StringBuilder sb = new StringBuilder();
        // String res="";
        // for(int i=0; i<sb.length(); i++) {
        //     res+=(ll.get(i));
        // }
        return sb.toString();
    }
}

class Pair{
    
    char c;
    int pos;
    
    public Pair(){}
    
    public Pair(char c, int pos) {
        this.c = c;
        this.pos = pos;
    }
}