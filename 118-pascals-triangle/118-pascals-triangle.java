class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        result.add(ls);
        
        for(int i=1; i<numRows; i++) {
            ls = new ArrayList<>();
            
            for(int j=0; j<i+1; j++) {
                if(j==0 || j==i) {
                    ls.add(1);
                }
                else {
                    List<Integer> prev = result.get(result.size()-1);
                    ls.add(prev.get(j-1)+prev.get(j));
                }
            }
            
            result.add(ls);
        }
        
        return result;
    }
}