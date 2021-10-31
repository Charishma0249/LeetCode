class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        
        int len = nums.length, sum=0;
        int count =0;

        if(len<3)
            return 0;
        
        Arrays.sort(nums);
        for(int i=0; i<len-2; i++) {
            
            for(int j=i+1, k=len-1; j<k; ) {
             
                sum = nums[i]+nums[j]+nums[k];
                if(sum<target) {
                    count=count+(k-j);
                    j++;
                }
                else if(sum>=target)
                    k--;
                
              
            }
        }
        
        // System.out.println(pq.toString());
        return count;
    }
}