class Solution {
    public int maxArea(int[] height) {
        
        int len = height.length;
        int area=0;
        for(int i=0, j= len-1; i<j; ){
            area = Math.max(area, Math.min(height[i], height[j])*(j-i));
            if(height[i]<height[j]){
                int n = height[i];
                i++;
                while(i<j && height[i]<n){
                    i++;
                }
            }
            else if(height[i]>height[j]){
                int n = height[j];
                j--;
                while(j>i && n>height[j])
                    j--;
            }
            else{
                // area = Math.max(area, Math.min(height[i], height[j])*(j-i));
                i++;
                j--;
                // continue;
            }
            // area = Math.max(area, Math.min(height[i], height[j])*(j-i));
        }
        
        return area;
    }
}