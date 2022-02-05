class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int tlen = target.length;
        int alen = arr.length;
        int[] n = new int[1001];
        
        if(tlen!=alen)
            return false; 
        
        for(int i : target)
            n[i]++;
        for(int i : arr)
            n[i]--;
        
        for(int i : n){
            if(i!=0)
                return false;
        }
        
        return true;
    }
}