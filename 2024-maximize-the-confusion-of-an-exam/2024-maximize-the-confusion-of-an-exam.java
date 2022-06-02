class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int len = answerKey.length();
        int count=0, maxCount=0;
        int trueCount =0, falseCount =0;
        
        for(int i=0, j=0; i<=j && j<len; j++) {
            char c = answerKey.charAt(j);
            
            if(c=='T') {
                trueCount++;
            }
            else {
                falseCount++;
            }
            
            count = Math.max(count, Math.max(trueCount, falseCount));
            
            while(j-i+1-count>k) {
                    char c1 = answerKey.charAt(i);
                    if(c1=='T') {
                        trueCount--;
                    }
                    else {
                        falseCount--;
                    }
                    i++;
            }
            
            maxCount = Math.max(maxCount, j-i+1);
        }
        
        return maxCount;
    }
}