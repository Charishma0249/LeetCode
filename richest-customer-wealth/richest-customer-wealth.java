class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int sum, max=0;
        
        for(int i=0;i<accounts.length;i++)
        {
            sum=0;
            for(int j:accounts[i])
                sum+=j;
            
            if(max<sum)
                max=sum;
        }
        
        return max;
    }
}