class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     
        int len = nums.length;
        int res=len+1,sum=nums[0];
        
        for(int i=0,j=0;i<=j && j<len;)
        {
            if(sum<target)
            {
                j++;
                
                if(j<=len-1)
                    sum+=nums[j];
            }
            
            else
            {
               // System.out.println("i="+i+", j="+j);
                int n = j-i+1;
                if(res>n)
                    res=n;
                
                sum-=nums[i];
                i++;
                System.out.println(res);
                
            }
        }
        return (res==len+1)?0:res;
    }
}