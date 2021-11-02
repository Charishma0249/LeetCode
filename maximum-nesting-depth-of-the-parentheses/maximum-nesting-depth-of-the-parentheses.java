class Solution {
    public int maxDepth(String s) {
        
        int count = 0, max=0;
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<s.length(); ) {
            
            char c = s.charAt(i);
            
           
                while(i<s.length() && c=='(') {
                    stk.push(c);
                    i++;
                    if(i<s.length())
                        c = s.charAt(i);
                    //count++;
                }
                while(i<s.length() && c!=')' && c!='(') {
                    i++;
                    if(i<s.length())
                        c = s.charAt(i);
                }
                int k=stk.size();
                while(i<s.length() && c==')' && !stk.isEmpty()) {
                    stk.pop();
                   // k++;
                    i++;
                    if(i<s.length())
                        c = s.charAt(i);
                    //count--;
                }  
                
                if(max<k)
                    max = k;
                
 
                
            
        }
        
        if(!stk.isEmpty())
            return 0;
        
        return max;
    }
}