class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int len = arr.length;
        if(len==1)
            return arr[0];
        
        for(int i=1; i<len-1; i++) {
            
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                return i;
        }
        
        if(arr[0]>arr[1])
            return 0;
        else
            return len-1;
    }
}