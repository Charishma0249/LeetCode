class Solution {
    
    //int count = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    public int climbStairs(int n) {
        
        return recClimb(n);
        
    }
    
    public int recClimb(int n)
    {
        if(n==0 || n==1 || n==2)
            return n;
        
        if(hm.containsKey(n))
            return hm.get(n);
        
        int res1 = recClimb(n-1);
        int res2 = recClimb(n-2);
        
        hm.put(n, res1+res2);
        
        return res1+res2;
    }
    
    
}