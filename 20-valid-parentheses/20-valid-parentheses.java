class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c==')' || c==']' || c=='}') {
                if(stk.isEmpty())
                    return false;
                char temp = stk.pop();
                if((c==')' && temp!='(') || (c==']' && temp!='[') || (c=='}' && temp!='{'))
                    return false;
            }
            else
                stk.push(c);
        }
        
        return !stk.isEmpty() ? false : true;
            
    }
}