class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        
        for(char c:s.toCharArray()) {
            
            if(!stk.isEmpty() && (c==')' || c==']' || c=='}')) {
                char temp = stk.pop();
                
                if(temp=='(' && c==')' || temp=='[' && c==']' || temp=='{' && c=='}')
                    continue;
                else
                    return false;
            }
            
            stk.push(c);
        }
        
        if(!stk.isEmpty())
            return false;
        
        return true;
    }
}