class Solution {
    public boolean isValid(String s) {
        Stack<Character> stringStack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(stringStack.isEmpty()) {
               stringStack.push(c); 
               continue;
            }
            char topChar = stringStack.peek();
            
            if((c == ')' && topChar=='(') || (c == ']' && topChar=='[') || (c == '}' && topChar=='{')){
                stringStack.pop();
                
            } else {
                stringStack.push(c);
            }
        }
        
        return stringStack.isEmpty();
    }
}