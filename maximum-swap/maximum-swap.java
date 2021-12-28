class Solution {
    public int maximumSwap(int num) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        int n = num;
        
        rec(n, al);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(al);
        
        Collections.sort(al, Collections.reverseOrder());
        //System.out.println(al);
       // System.out.println(temp);
        for(int i=0; i<al.size(); i++) {
            n = al.get(i);
           // System.out.println(n);
            int j = temp.lastIndexOf(n);
            int k=0;
            for(k=0; k<j; k++) {
                // System.out.println(temp.get(k));
                if(temp.get(k)<n) {
                   // System.out.println(temp.get(k));
                    swap(k, j, temp);
                    break;
                }
            }
           // System.out.println(temp);
            if(k!=j)
                break;
        }
        
        //System.out.println(temp);
        int pow = 0;
        n=0;
        for(int i=temp.size()-1; i>=0; i--) {
            n+=temp.get(i)*Math.pow(10, pow);
            pow++;
        }
        return n;
    }
    
    public void rec(int n, ArrayList<Integer> al) {
        
        if(n<=0)
            return ;
        
        rec(n/10, al);
        al.add(n%10);
    }
    
    public void swap(int a, int b, ArrayList<Integer> al) {
        
        int temp = al.get(a);
        al.set(a, al.get(b));
        al.set(b, temp);
        
       // System.out.println("a = "+a+" b = "+b);
    }
}