class Solution {
    
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        int len = nums.length,temp;
        
        if(len<4)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<len && len-i>3;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            
            temp = target-nums[i];
            threeSum(i+1,len,temp,nums);
        }
        
        return res;
    }
    
    void threeSum(int n, int len, int temp,int[] nums)
    {
        int target, sum;
        for(int i=n;i<len && len-i>2;i++)
        {
           // System.out.println(temp);
            if(i!=n && nums[i]==nums[i-1])
                continue;
            
            target = temp-nums[i];
            
            for(int j=i+1,k=len-1;j<k;)
            {
                if(j!=i+1 && nums[j]==nums[j-1])
                {
                    j++;
                    continue;
                }
                
                if(k!=len-1 && nums[k]==nums[k+1])
                {
                    k--;
                    continue;
                }
                sum = nums[j]+nums[k];
                if(sum<target)
                    j++;
                else if (sum>target)
                    k--;
                else
                {
                    //System.out.println(i);
                    res.add(new ArrayList<>(Arrays.asList(nums[n-1],nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                }
            }
        }
    }
}