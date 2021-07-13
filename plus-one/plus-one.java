class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length, carry=1,sum;
        for(int i = len-1; i>=0; i--)
        {
            sum = digits[i]+carry;
            
            if(sum>=10)
            {
                carry = 1;
                sum = sum%10;
            }
            else
                carry = 0;
            
            digits[i] = sum;
        }
        
        if(carry==0)
            return digits;
        
        int[] res = new int[len+1];
        res[0]=carry;
        
        for(int i =0;i<len;i++)
            res[i+1]=digits[i];
        
        return res;
    }
}