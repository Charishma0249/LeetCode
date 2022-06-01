class Solution {
    public boolean checkZeroOnes(String s) {
        int maxCounterOnes = 0, maxCounterZeros = 0;
        int tempCounterOnes = 0, tempCounterZeros = 0;
        
        for(char c:s.toCharArray()) {
            
            if(c=='0') {
                tempCounterZeros++;
                maxCounterOnes = Math.max(maxCounterOnes, tempCounterOnes);
                tempCounterOnes = 0;
            }
            else {
                tempCounterOnes++;
                maxCounterZeros = Math.max(maxCounterZeros, tempCounterZeros);
                tempCounterZeros = 0;
            }
        }
        
        maxCounterOnes = Math.max(maxCounterOnes, tempCounterOnes);
        maxCounterZeros = Math.max(maxCounterZeros, tempCounterZeros);
        return maxCounterOnes>maxCounterZeros;
    }
}