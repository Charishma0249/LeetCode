class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        int count=0;
        String res = "";
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(Pair p1, Pair p2) {
                
                if(p2.count>p1.count)
                    return 1;
                else if(p1.count> p2.count)
                    return -1;
                return 0;
            }
        });
        
        pq.add(new Pair('a', a));
        pq.add(new Pair('b', b));
        pq.add(new Pair('c', c));
        
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            
            if(p.count==0 || (pq.size()==0 && res.length()>0 && res.charAt(res.length()-1)==p.c && count==2))
                continue;
            else if(pq.size()>0 && res.length()>0 && res.charAt(res.length()-1)==p.c){
                if(count==2) {
                Pair temp = pq.poll();
                if(temp.count>1) {
                res += temp.c;
                temp.count--;
                pq.add(new Pair(temp.c, temp.count));
                count =1;
                }
                }
                else {
                    res += p.c;
                    p.count--;
                    pq.add(new Pair(p.c, p.count));
                    count++;
                }
            }
            
            else if(p.count>=3 && (res.length()==0 || (res.charAt(res.length()-1)!=p.c))) {
                count =0;
                res += p.c;
                res+=p.c;
                p.count -= 2;
                if(!pq.isEmpty()) {
                Pair temp = pq.poll();
                if(temp.count>=1) {
                    res += temp.c;
                    temp.count--;
                    pq.add(new Pair(temp.c, temp.count));
                    count++;
                }
                }
                count += 2;
                pq.add(new Pair(p.c, p.count));
                
            }
            else if(p.count>=1 && (res.length()==0 || res.charAt(res.length()-1)!=p.c)){
                res += p.c;
                p.count--;
                pq.add(new Pair(p.c, p.count));
                count = 1;
            }
            
            
        }
        
        return res;

        
        
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