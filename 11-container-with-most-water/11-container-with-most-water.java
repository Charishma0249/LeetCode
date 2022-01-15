class Solution {
    int max = 0;
    public int maxArea(int[] height) {
        
        
        dp(height, 0, height.length-1);
        return max;
    }
    
    public void dp(int[] h, int k, int l) {
        
        if(k>=l)
            return ;
        
        if(h[k]<h[l]) {
                max = Math.max(h[k]*(l-k), max);
                dp(h, k+1, l);
            }
        else {
                max = Math.max(h[l]*(l-k), max);
                dp(h, k, l-1);
        }
        
    }
}