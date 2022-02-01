class Solution {
    public String decodeString(String s) {
        
        Stack<Character> stk = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            
            char c = s.charAt(i);
            
            if(!stk.empty() && c==']') {
                String str = "";
                while(!stk.empty()) {
                    char cs = stk.pop();
                    if(cs=='[')
                        break;
                    str += cs;
                      // System.out.println(cs);
                }
                char ci = stk.pop();
                StringBuilder count = new StringBuilder();
                count.append(ci);
                while(!stk.isEmpty()) {
                    ci = stk.pop();
                    // System.out.println("ci = "+ci);
                    if(ci<'0' || ci>'9') {
                        stk.push(ci);
                        break;
                    }
                    count.append(ci);   
                }
                
                // System.out.println("count = "+count.reverse().toString());
                int counter = Integer.valueOf(count.reverse().toString());
                char[] arr = str.toCharArray();
                
                for(int k=0; k<counter; k++) {
                    for(int j=arr.length-1; j>=0; j--) {
                        stk.push(arr[j]);
                    }
                }
            }
            else
                stk.push(c);
        }
        
        while(!stk.empty()) {
            res.append(stk.pop());
        }
        
        return res.reverse().toString();
    }
}