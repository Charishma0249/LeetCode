class Solution {
    public boolean validPalindrome(String s) {
        
        int len = s.length();
        int count = 0;
        int i=-1, j=0;
        
        for(i=0, j=len-1; i<j; ){
            
            if(s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }
            else{
                int k = i, l = j;
                if(i+1<len && s.charAt(i+1)==s.charAt(j)) {
                    count++;
                    i++;
                    while(i<j && s.charAt(i)==s.charAt(j)) {
                        i++;
                        j--;
                    }
                    
                    if(i>=j) {
                        return true;
                    }
                }
                i = k;
                j = l;
                if(j-1>=0 && s.charAt(i)==s.charAt(j-1)) {
                    j--;
                    while(i<j && s.charAt(i)==s.charAt(j)) {
                        i++;
                        j--;
                    }
                    
                    if(i>=j) {
                        return true;
                    }
                }
                
                if(i<j)
                    return false;
                // if(i+1<len && s.charAt(i+1)!=s.charAt(j) && j-1>=0 && s.charAt(i)!=s.charAt(j-1))
                //     return false;
            }
        }
        
        return i>=j;
    }
}