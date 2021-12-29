class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int len = flowerbed.length;
        int count =0, j=1;
        
        if(len==0)
            count =0;
        else if(len==1 && flowerbed[0]==0)
            count=1;
        if(len>=2 && flowerbed[0]==0 && flowerbed[1]==0) {
            flowerbed[0]=1;
            count++;
            j=2;
        }
        if(len>=2 && flowerbed[0]==1 && flowerbed[1]==0) {
            j=2;
        }
            
        for(int i=j; i<len-1; i++) {
            if(flowerbed[i]==0) {
                if(flowerbed[i+1]==0 && flowerbed[i-1]!=1) {
                    flowerbed[i]=1;
                    count++;
                    i++;
                }
            }
        }
        
        if(len>=2 && flowerbed[len-1]==0 && flowerbed[len-2]!=1)
            count++;
        if(n<=count)
            return true;
        return false;
    }
}