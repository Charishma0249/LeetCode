class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int len = arr.length;
        int[] res = new int[len];
        
        if(len == 0)
            return res;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<len; i++)
            hm.put(i, arr[i]);
        
        HashMap<Integer, Integer> temp = hm.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        int rank = 0;
        int m = Integer.MAX_VALUE;
        
        for(Map.Entry<Integer, Integer> entry : temp.entrySet())
        {
            int n = entry.getValue();
            
            int index = entry.getKey();
            
            if(n==m)
                res[index] = rank;
            else
                res[index] = ++rank;
            
            m = n;
        }
        
        return res;
    }
}