class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int k =len-1, sq1, sq2;
        
        int[] result = new int[len];
        for(int i=0, j=len-1;i<=j && k>=0;)
        {
            sq1 = nums[i]*nums[i];
            sq2 = nums[j]*nums[j];
            
            if(i==j)
            {
                result[k]=sq1;
                break;
            }
            if(sq1>sq2)
            {
                result[k]=sq1;
                i++;
            }
                
            else if(sq1<sq2)
            {
                result[k]=sq2;
                j--;
            }
            
            else
            {
                result[k]=sq1;
                k--;
                result[k]=sq2;
                i++;
                j--;
            }
            
            k--;
        }
        
        return result;
    }
}