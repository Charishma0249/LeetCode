class Solution {
    public boolean checkPerfectNumber(int num) {
        
        if(num==1)
            return false;
        
        int n = (int)Math.sqrt(num);
        int i=2, sum=0;
        
        while(i<=n)
        {
            if(num%i==0)
            {
               // System.out.println(i);
                sum+=i;
                sum+=num/i;
            }
            i++;
        }
        
        if(sum+1==num)
            return true;
        
        return false;
    }
}