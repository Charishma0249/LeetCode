class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int result = 0;
        
        for(int i=0; i<operations.length; i++) {
            
            String s = operations[i];
            
            for(int j=0; j<s.length(); j++) {
                
                char c = s.charAt(j);
                
                if(c=='X') {
                    if(j+1<s.length()) {
                        char nc = s.charAt(j+1);
                        if(nc=='-') {
                            result--;
                        } else {
                            result++;
                        }
                    }
                } else if(c=='-') {
                    result--;
                } else {
                    result++;
                }
                break;
            }
        }
        
        return result;
    }
}