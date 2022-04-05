class Solution {
    public int maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        int max = 0;
        
        for(char c : s.toCharArray()){
            
            if(c=='(')
                stk.push('(');
            else if(c==')'){
                max = Math.max(max, stk.size());
                stk.pop();
            }
                
        }
        
        return max;
    }
}