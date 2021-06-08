class Solution {
    public boolean isPalindrome(int x) {
        
        int[] arr=new int[10];
        
        if(x<0)
            return false;
        
        int n=x, i=-1;
        while(n>0)
        {
            arr[++i]=n%10;
            n=n/10;
        }
        
        for(int j=0;j<=i;)
        {
            if(arr[j]!=arr[i])
                return false;
            
            j++;
            i--;
        }
        
        return true;
    }
}