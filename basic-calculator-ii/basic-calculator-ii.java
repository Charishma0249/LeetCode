class Solution {
    public int calculate(String s) {
        Stack<Integer> stk = new Stack<>();
        
        int len = s.length();
        
        for(int i=0; i<len; ) {
            char c = s.charAt(i);
           // System.out.println("c = "+c);
           // int n = getInt(c);
            if(c==' ') {
                i++;
                continue;
            }
            else if(c!='*' && c!='/') {
                
                if(c=='+') {
                    i++;
                    stk.push(-1);
                }
                else if(c=='-') {
                    i++;
                    stk.push(-2);
                }
                else {
                   // int n = c-'0';
                    StringBuilder sb = new StringBuilder();
                    while(i<len && c>='0' && c<='9') {
                        sb.append(c);
                        i++;
                        if(i<len)
                            c = s.charAt(i);
                    }
                  //  System.out.println("sb = "+sb);
                    int d = 0;
                    int n=0;
                    for(int j=sb.length()-1; j>=0; j--) {
                        n+=(sb.charAt(j)-'0')*Math.pow(10, d);
                        d++;
                    }
                 //   System.out.println("n = "+n);
                    stk.push(n);
                    //i++;
                }
                    
                //i++;
            }
            else if(c=='*' || c=='/') {
                char temp = c;
                int n = stk.pop();
                i++;
                //int m=1;
                
                while(i<len && s.charAt(i)==' ') {
                    
                    i++;
                }
                int m=0;
                c = s.charAt(i);
                StringBuilder sb = new StringBuilder();
                while(i<len && c>='0' && c<='9') {
                        sb.append(c);
                        i++;
                        if(i<len)
                            c = s.charAt(i);
                    }
                   // System.out.println("sb1 = "+sb);
                    int d = 0;
                    //int m=0;
                    for(int j=sb.length()-1; j>=0; j--) {
                        m+=(sb.charAt(j)-'0')*Math.pow(10, d);
                        d++;
                    }
                
               // System.out.println("n = "+n+" m = "+m);
                int res;
                if(temp=='*')
                    res = n*m;
                else
                    res = n/m;
                //System.out.println(c);
               // System.out.println(res);
                stk.push(res);
                //i++;
            }
        }
        
        int i=0, res=stk.get(i);
        //int c = stk.get(i);
        //System.out.println(stk.toString());
        while(i<stk.size()-2) {
           // System.out.println(i);
            
            int c1 = stk.get(i+1);
            int b = stk.get(i+2);
           // System.out.println("res = "+res+" b = "+b);
            if(c1==-1)
                res+=b;
            else
                res-=b;
            i=i+2;
        }
        
        //if(stk)
        return res;
    }
    
//     public int getInt(char c) {
        
//         if(c!='*' && c!='/' && c!='+' && c!='-')
//             return 
//     }
}