class Solution {
    String s = "";
    public int compress(char[] chars) {
        
        
        int count =1;
        for(int i=1; i<chars.length; i++) {
            if(chars[i]==chars[i-1])
                count++;
            else {
                s+=chars[i-1];
                
                // System.out.println("c = "+chars[i-1]+" count = "+count);
                if(count>1)
                    rec(count);
                count = 1;
            }
        }
        
        if(count>0) {
            s+=chars[chars.length-1];
            if(count>1)
                rec(count);
        }
        // System.out.println(s);
        for(int i=0; i<s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
    
    public void rec(int count) {
        
        if(count<=0)
            return ;
        rec(count/10);
        s+=count%10;
    }
}