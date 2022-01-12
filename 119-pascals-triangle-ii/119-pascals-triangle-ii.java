class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> al1 = new ArrayList<>();
        //al1.add(1);
        for(int i=0; i<=rowIndex; i++)
            al1.add(1);
        for(int i=1; i<rowIndex; i++) {
            for(int j=i; j>0; j--) {
                al1.set(j, al1.get(j)+al1.get(j-1));
            }
        }
        
        return al1;
    }
}