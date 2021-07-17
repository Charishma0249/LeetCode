class Solution {
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    int len;
    
    public int minCostClimbingStairs(int[] cost) {
        
       len = cost.length; 
       return rec(cost, 0, len); 
    }
    
    public int rec(int[] cost, int sum, int n)
    {
        if(n-1<0)
            return 0;
         
        if(hm.containsKey(n))
            return hm.get(n);
        
        int res2 = cost[n-1]+rec(cost, sum, n-1);
        int res1 = 0;
        if(n-2>=0)
            res1 = cost[n-2]+rec(cost, sum, n-2);
        
        int res = Math.min(res1, res2);
            
        hm.put(n, res);
        return res;
    }
    
}