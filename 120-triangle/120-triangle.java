class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int min = Integer.MAX_VALUE;
        for(int i=1; i<triangle.size(); i++) {
            List<Integer> prev = triangle.get(i-1);
            List<Integer> path = triangle.get(i);
            for(int j=0; j<path.size(); j++) {
                if(j==0) {
                    path.set(j, path.get(j)+prev.get(j));
                } else if(j==path.size()-1) {
                    path.set(j, path.get(j)+prev.get(j-1));
                } else {
                    path.set(j, path.get(j)+Math.min(prev.get(j-1), prev.get(j)));
                }
                
                if(i==triangle.size()-1) {
                    min = Math.min(min, path.get(j));
                }
            }
            triangle.set(i, path);
        }
        
        return min == Integer.MAX_VALUE? triangle.get(0).get(0) : min;
    }
}