class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int tlen = target.length;
        int alen = arr.length;
        if(tlen!=alen)
            return false; 
        Arrays.sort(target);
        Arrays.sort(arr);
        
        for(int i=0; i<tlen; i++) {
            if(target[i]!=arr[i])
                return false;
        }
        
        return true;
    }
}