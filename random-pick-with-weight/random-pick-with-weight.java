class Solution {

   // int[] weight;
    int[] wsum;
    public Solution(int[] w) {
      //  weight = w;
        wsum = new int[w.length];
        wsum[0] = w[0];
        for(int i=1; i<w.length; i++) {
            wsum[i] = wsum[i-1]+w[i];
        }
       // System.out.println(wsum[wsum.length-1]);
    }
    
    public int pickIndex() {
        Random rand = new Random();
        int index = rand.nextInt(wsum[wsum.length-1])+1;
       // System.out.println(index);
        for(int i=0; i<wsum.length; i++) {
            if(index<=wsum[i])
                return i;
        }
        
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */