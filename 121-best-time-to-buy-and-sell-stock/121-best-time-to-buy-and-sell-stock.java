class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int min = Integer.MAX_VALUE;
        int res=0;
        
        for(int i=0; i<prices.length; i++) {
            
            if(prices[i]<min) {
                min = prices[i];
            } 
            else if(prices[i]-min>=res){
                 max = prices[i];
                 res = prices[i]-min; 
            }
        }
        
        return res;
    }
}