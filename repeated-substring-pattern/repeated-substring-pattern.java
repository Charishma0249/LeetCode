class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int len = s.length();
        
        for(int i=0; i<len/2; i++) {
            
            if(len%(i+1)==0) {
                
                int count = len/(i+1);
                
                String substr = s.substring(0,i+1);
                StringBuilder sb = new StringBuilder("");
                
                for(int j=0; j<count; j++)
                    sb.append(substr);
                
                if(s.equals(sb.toString()))
                    return true;
            }
            
        }
        
        return false;
    }
}