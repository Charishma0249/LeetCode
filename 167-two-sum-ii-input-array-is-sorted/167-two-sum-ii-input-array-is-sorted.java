class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        int len = numbers.length;
        
        for(int i=0, j=len-1; i<j; ) {
            int sum = numbers[i]+numbers[j];
            if(sum>target) {
                j--;
            } 
            else if(sum<target) {
                i++;
            } else {
                return new int[]{i+1, j+1};
            }
        }
        
        return result;
    }
}