class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        if(arr.length==1)
            return arr[0];
        
        for(int i=0; i<arr.length; i++) {
            if(i==0 && arr[i]>arr[i+1])
                return i;
            else if(i==arr.length-1 && arr[i]>arr[i-1])
                return i;
            else if(i!=0 && i!= arr.length-1 && arr[i]>arr[i-1] && arr[i]>arr[i+1])
                return i;
        }
        return arr.length-1;
        
    }
}