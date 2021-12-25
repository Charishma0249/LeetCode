class Solution {
    public int minAddToMakeValid(String s) {
        
        int count =0;
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            
            char c = s.charAt(i);
            if(c=='(')
                stk.push(c);
            else {
                if(stk.isEmpty())
                    count++;
                else
                    stk.pop();
            }
        }
        
        while(!stk.isEmpty()) {
            stk.pop();
            count++;
        }
        
        return count;
    }
}