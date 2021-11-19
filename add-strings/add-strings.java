class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length();
        int len2 = num2.length();
        int sum=0, carry=0, rem=0, i, j;
        
        for(i=len1-1, j=len2-1; i>=0 && j>=0; i--,j--) {
            sum = num1.charAt(i)-'0'+num2.charAt(j)-'0'+carry;
            carry = sum/10;
            rem = sum%10;
            
            sb.append(rem);
        }
        
        while(i>=0) {
            sum = num1.charAt(i)-'0'+carry;
            carry = sum/10;
            rem = sum%10;
            
            sb.append(rem);
            i--;
        }
        
        while(j>=0) {
            sum = num2.charAt(j)-'0'+carry;
            carry = sum/10;
            rem = sum%10;
            
            sb.append(rem);
            j--;
        }
        
        if(carry!=0)
            sb.append(carry);
        
        return sb.reverse().toString();
    }
}