class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int len = nums.length;
        int[] res = new int[2];
        
        if(len==0)
            return new int[]{-1,-1};
        
        for(int i=0, j=len-1;i<len && j>=0;)
        {
            if(target==nums[i])
            {
                res[0]=i;
                res[1]=i;
                
                while(i+1<len && target==nums[++i])
                    res[1]=i;
                
                return res;
            }
            
            else if(target==nums[j])
            {
                res[1]=j;
                res[0]=j;
                
                while(j-1>=0 && target==nums[--j])
                    res[0]=j;
                
                return res;
            }
            
            else if(i==j || i>j)
                return new int[]{-1,-1};
            else if(target>nums[i] && target<nums[j])
            {
                i++;
                j--;
            }
            else if(target>nums[i])
                i++;
            else if(target<nums[j])
                j--;
            
        }
        
        return res;
    }
}