class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int len = nums.length, sum=0;
        
        if(len==1)
            return false;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<len; )
        {
            int j=i;
            int rem;
            sum+=nums[i];
            
            if(sum%k==0 && i!=0)
                return true;
            else
            {
                rem = sum%k;
                
               // System.out.println(rem);
                
                if(hm.containsKey(rem) && hm.get(rem)!=i-1)
                    return true;
                
                i++;
            }
            
            rem = sum%k;
           // System.out.println(rem);
            if(nums[j]!=0)
                hm.put(rem, j);
            
        }
        
        return false;
    }
}