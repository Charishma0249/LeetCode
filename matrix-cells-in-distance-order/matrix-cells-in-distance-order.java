class Solution {
    
    HashMap<Integer, List<Integer>> hm = new HashMap<>();
    HashMap<Integer, List<Integer>> hmc = new HashMap<>();
    int max = Integer.MIN_VALUE;
    
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        int[][] res = new int[rows*cols][2];
        
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                int dist = Math.abs(i-rCenter)+Math.abs(j-cCenter);
                
                if(dist>max)
                    max = dist;
                
                List<Integer> ls = new ArrayList<>();
                List<Integer> lsc = new ArrayList<>();
                
                if(hm.containsKey(dist))
                {
                    ls = hm.get(dist);
                    lsc = hmc.get(dist);
                }
                
                ls.add(i);
                lsc.add(j);
                
                hm.put(dist, ls);
                hmc.put(dist, lsc);
                
            }
        }
        
        int j=0;
        
        for(int i=0; i<=max; i++)
        {
            if(hm.containsKey(i))
            {
                List<Integer> ls = hm.get(i);
                List<Integer> lsc = hmc.get(i);
                
                for(int k=0;k<ls.size();k++)
                {
                    res[j][0] = ls.get(k);
                    res[j][1] = lsc.get(k);
                    j++;
                }
            }
        }
        
        return res;
        
    }
}