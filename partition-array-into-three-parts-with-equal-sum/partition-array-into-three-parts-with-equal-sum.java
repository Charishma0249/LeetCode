class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum =0;
        int len = arr.length, count=0, n;
        for(int i: arr)
            sum+=i;
        
        n = sum/3;
        
        if(3*n != sum)
            return false;
        
        sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=arr[i];
    
            if(sum==n)
            {
                count++;
                
                if(count==3)
                    return true;
                sum=0;
            }
        }
        
        // if(count==3)
        //     return true;
        
        return false;
    }
}