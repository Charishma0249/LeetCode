class Solution {
    List<String> res = new ArrayList<>();
    int slen;
    public List<String> generateParenthesis(int n) {
        slen = n+n;
        rec("", n, n);
        return res;
    }
    
    public void rec(String s, int left, int right){
        
        if(s.length()==slen){
            // String s = new String(sb);
            // System.out.println(s);
            res.add(s);
            return ;
        }
        // if(left==0 || right==0)
        //     return ;
        // if(right<left)
        //     return ;

        
        if(left>0)
            rec(s+"(", left-1, right);
        if(right>left && right>0)
            rec(s+")", left, right-1);
        

    }
}