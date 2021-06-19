class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] res = new int[2];
        
        for(int i=0,j=numbers.length-1;i<j;)
        {
            int sum = numbers[i]+numbers[j];
            if(sum==target)
            {
                res[0]=i+1;
                res[1]=j+1;
               return res; 
            }        
            
            else if(sum<target)
                i++;
            else if(sum>target)
                j--;
            
        }
        
        return res;
    }
}