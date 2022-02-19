class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        for(char c : s.toCharArray()){
            
            if(c=='}' || c==']' || c==')'){
                
                if(stk.isEmpty())
                    return false;
                char popChar = stk.pop();
                
                if((c=='}' && popChar=='{') || (c==']' && popChar=='[') || (c==')' && popChar=='('))
                    continue;
                
                return false;
            }
            
            stk.push(c);
        }
        
        return stk.isEmpty();
    }
}