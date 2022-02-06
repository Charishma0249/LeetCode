class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int j=0, count =0, max = Integer.MIN_VALUE, temp=k,counti=0;
        for(int i=0; i<nums.length; ){
            if(nums[i]==0){
                if(counti==0)
                    j = i;
                // int temp = k;
                while(i<nums.length && temp>0 && nums[i]==0){
                    count++;
                    temp--;
                    i++;
                    counti++;
                }
                if(i<nums.length && nums[i]==0) {
                    // System.out.println(count);
                    max = Math.max(max, count);
                    count =0;
                    i=j+1;
                    temp=k;
                    counti=0;
                }
            }
            if(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
                
        }
        
        return Math.max(count, max);
    }
}