class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c=='}' || c==']' || c==')'){
                
                if(stk.isEmpty())
                    return false;
                char popChar = stk.pop();
                
                if(c=='}' && popChar=='{' || c==']' && popChar=='[' || c==')' && popChar=='(')
                    continue;
                else
                    return false;
            }
            
            stk.push(c);
        }
        
        return stk.isEmpty();
    }
}