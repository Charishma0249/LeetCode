class Solution {
    int max=0;
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i]<min) {
               min = prices[i];
            }
            else {
                max = Math.max(max, prices[i]-min);
            }
        }
        
        //System.out.println("min = "+min+" max = "+max);
        return max;
    }
    
   
}

//1,4,2