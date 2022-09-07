class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int result = 0;
        
        for(int i=0; i<operations.length; i++) {
            
            String s = operations[i];
                
            char c = s.charAt(0);
                
            if(c=='X') {
                char nc = s.charAt(1);
                if(nc=='-') {
                    result--;
                } else {
                    result++;
                }
            } else if(c=='-') {
                result--;
            } else {
                result++;
            }
        }
        
        return result;
    }
}