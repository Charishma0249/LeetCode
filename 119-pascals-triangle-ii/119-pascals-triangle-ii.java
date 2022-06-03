class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> prev = new ArrayList<>();
        for(int i=0; i<rowIndex+1; i++) {
            List<Integer> ls = new ArrayList<>();
            for(int j=0; j<i+1; j++) {
                if(j==0 || j==i) {
                    ls.add(1);
                }
                else {
                    ls.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev = ls;
        }
        
        return prev;
    }
}