class Solution {
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    public int tribonacci(int n) {
        
        return rec(n);
    }
    
    public int rec(int n)
    {
        if(n==0 || n==1)
            return n;
        if(n==2)
            return 1;
        
        if(hm.containsKey(n))
            return hm.get(n);
        
        int sum = rec(n-3) + rec(n-2) + rec(n-1);
        
        hm.put(n, sum);
        
        return sum;
    }
}