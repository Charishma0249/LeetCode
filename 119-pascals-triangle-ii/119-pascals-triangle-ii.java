class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> al1 = new ArrayList<>();
        al1.add(1);
        List<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(1);
        //al2=al1;
        if(rowIndex==0)
            return al1;
        else if(rowIndex==1)
            return al2;
        
        
        for(int i=2; i<=rowIndex; i++) {
            al1 = new ArrayList<>();
            for(int j=0; j<=i; j++) {
              //  System.out.println(j);
                if(j==0 || j==i)
                    al1.add(1);
                else
                    al1.add(al2.get(j-1)+al2.get(j));
            }
            //al2 =new ArrayList<>(al1);
            al2 = al1;
        }
        
        return al2;
    }
}