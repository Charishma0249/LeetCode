class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int len = s.length();
        for(int i=0; i<=len; i++) {
            char c = ' ';
            
            if(i<len)
                c = s.charAt(i);
           
            if(!stk.isEmpty()) {
                if(c!=stk.peek()) {
                    char temp = stk.pop();
                    int count =1;
                    while(!stk.isEmpty()) {
                        if(temp==stk.peek()) {
                            temp = stk.pop();
                            count++;
                        }
                        else
                            break;
                    }
                    
                    if(count%2!=0) {
                        stk.push(temp);
                    }
                }
            }
            
            stk.push(c);
        }
        
        if(stk.peek()==' ')
            stk.pop();
        
      while(!stk.isEmpty()) {
          sb.append(stk.pop());
      }
        
        return sb.reverse().toString();
    }
}