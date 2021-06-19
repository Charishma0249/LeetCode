class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int len = nums.length,sum,target;
        
        List<List<Integer>> resls = new ArrayList<List<Integer>>();
        
        if(len<3)
            return resls;
        
        Arrays.sort(nums);
        
        for(int i=0;i<len;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            target = -nums[i];
            
            for(int j=i+1, k=len-1;j<k;)
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
                else if(sum>target)
                    k--;
                else
                {
                    List<Integer> ls= new ArrayList<Integer>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    resls.add(ls);
                    j++;
                    k--;
                    
                }
            }
        }
        
        return resls;
        
    }
}