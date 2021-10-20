class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int len = isConnected.length, res=0;
        
        HashSet<Integer> hsp = new HashSet<>();
        
        for(int i=0; i<isConnected.length; i++) {
            
            
            if(hsp.size()==len)
                return res;
            if(!hsp.contains(i)) {
                //System.out.println("Hey i = "+i);
                hsp.add(i);
                HashSet<Integer> hs = new HashSet<Integer>();
                hs.add(i);
                dfs(hs, isConnected, i, hsp);
                
                res++;
            }
        }
        
        return res;
    }
    
    public void dfs(HashSet<Integer> hs, int[][] arr, int i, HashSet<Integer> hsp) {
        
            for(int j=0; j<arr[i].length; j++) {
                
                //System.out.println("i = "+i);
                //System.out.println(hs.contains(i));
                if(i!=j && arr[i][j]==1 && !hs.contains(j)) {
                   // System.out.println("i = "+i+" j = "+j);
                   // hs.add(j);
                    hs.add(j);
                    
                    hsp.add(j);
                   // hsp.add(j);
                    dfs(hs, arr, j, hsp);
                }
           }
    }
}