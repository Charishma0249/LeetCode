class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     
        int len = nums.length;
        int res=len+1,sum=0;
        
        for(int i=0,j=0;i<=j && j<len;j++)
        {
            sum+=nums[j];
            
            while(sum>=target && i<=j)
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