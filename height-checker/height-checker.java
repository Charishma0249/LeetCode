class Solution {
    public int heightChecker(int[] heights) {
        
        int len = heights.length, count=0;
        int[] temp = new int[len];
        
        for(int i=0; i<len;i++)
            temp[i]=heights[i];
        
        Arrays.sort(heights);
        
        for(int i=0; i<len;i++) {
            if(temp[i]!=heights[i])
                count++;
        }
        
        return count;
    }
}