class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int len = nums.length, sum=0, count=0;
        
        int[] prefix = new int[len];
        
        for(int i=0; i<len;i++)
        {
            if(nums[i]==k)
                count++;
            
            sum+=nums[i];
            prefix[i]=sum;
            
        }
        
        for(int i=0; i<len;i++)
        {
            for(int j=i+1; j<len;j++)
            {
                int diff;
                
                if(i==0)
                    diff = prefix[j];
                else
                    diff = prefix[j]-prefix[i-1];
                
                if(diff==k)
                    count++;
            }
        }
        return count;
        
    }
}