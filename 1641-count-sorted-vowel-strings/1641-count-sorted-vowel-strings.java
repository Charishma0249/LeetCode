class Solution {
    public int countVowelStrings(int n) {
        int[] vowels = new int[]{'a','e','i','o','u'};
        return rec(n, 0, 0, vowels);
    }
    
    public int rec(int n, int idx, int i, int[] vowels){
        
        int res=0;
        if(idx==n)
            return 1;
        
        for(int j=i; j<vowels.length; j++){
            res+=rec(n, idx+1, j, vowels);
        }
        
        return res;
    }
}