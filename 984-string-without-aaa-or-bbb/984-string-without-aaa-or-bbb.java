class Solution {
    public String strWithout3a3b(int a, int b) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p2.count>p1.count)
                    return 1;
                else if(p1.count>p2.count)
                    return -1;
                
                return 0;
            }
        });
        
        String s = "";
        int count =0;
        
        pq.add(new Pair('a',a));
        pq.add(new Pair('b',b));
        
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            
            if(p.count==0)
                continue;
            if((s.length()>0 && s.charAt(s.length()-1)!=p.c) || s.length()==0){
                if(p.count>=2) {
                    s+=p.c;
                    s+=p.c;
                    count =2;
                    p.count -= 2;
                }
                else {
                    s+=p.c;
                    count =1;
                    p.count--;
                }
                
            }
            else if(s.length()>0 && s.charAt(s.length()-1)==p.c) {
                
                if(count<2) {
                    s+=p.c;
                    count=1;
                    p.count--;
                }
                else if(count==2) {
                    if(pq.size()>0) {
                        Pair temp = pq.poll();
                        s+=temp.c;
                        temp.count--;
                        count =1;
                        pq.add(new Pair(temp.c, temp.count));
                    }
                }
            }
            
            
            pq.add(new Pair(p.c, p.count));
        }
        
        return s;
    }
}

class Pair{
    char c;
    int count;
    
    Pair(char c, int count) {
        this.c = c;
        this.count = count;
    }
}