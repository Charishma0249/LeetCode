class Solution {
    public int[][] highFive(int[][] items) {
        
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        int[][] res;
        
        for(int i=0; i<items.length; i++) {
            int m = items[i][0];
            int n = items[i][1];
            
            List<Integer> al = new ArrayList<>();
            if(tm.containsKey(m))
                al = tm.get(m);
            
            al.add(n);
            tm.put(m, al);
        }
        
        res = new int[tm.size()][2];
        int j=-1;
        for(Map.Entry<Integer, List<Integer>> entry : tm.entrySet()) {
            List<Integer> al = entry.getValue();
            Collections.sort(al, Collections.reverseOrder());
            
            int sum=0;
            for(int i=0; i<5; i++) {
               // System.out.println(al.get(i));
                sum += al.get(i);
            }
            
            res[++j][0] = entry.getKey();
            res[j][1] = sum/5;
        }
        
        return res;
    }
}