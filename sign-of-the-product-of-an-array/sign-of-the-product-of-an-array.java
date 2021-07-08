class Solution {
    public int arraySign(int[] nums) {
        
        int j=1, mul=1;
        
        for(int i : nums)
        {
            if(i<0)
                j = -1;
            else if(i>0)
                j = 1;
            else
                return 0;
            
            mul = mul*j;
        }
        
        if(mul>0)
            return 1;
        
        return -1;
    }
}