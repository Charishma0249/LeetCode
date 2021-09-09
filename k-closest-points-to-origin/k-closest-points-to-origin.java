class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] res = new int[k][2];
        int len = points.length;
        
        HashMap<Integer, Double> hm = new HashMap<>();
        
        for(int i=0; i<len; i++)
        {
            double dist = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            hm.put(i, dist);
        }
        
        HashMap<Integer, Double> temp = hm.entrySet().stream().sorted((i, j) -> i.getValue().compareTo(j.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));
        
        int i=0;
        for(Map.Entry<Integer, Double> entry : temp.entrySet())
        {
            int n = entry.getKey();
            res[i][0] = points[n][0];
            res[i][1] = points[n][1];
            i++;
            
            if(i==k)
                break;
        }
        
        return res;
    }
}