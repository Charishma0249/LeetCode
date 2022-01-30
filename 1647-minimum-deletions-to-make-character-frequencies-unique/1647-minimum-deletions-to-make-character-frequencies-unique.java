class Solution {
    public int minDeletions(String s) {
        
        int count =0, prev =0;
        int[] alp = new int[26];
        char ctemp = 'A';
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
        for(char c: s.toCharArray()) {
            alp[c-'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(alp[i]>0)
                pq.add(new Pair((char)('a'+i), alp[i]));
        }
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            // System.out.println(p.c+" "+p.count);
            if(pq.size()>0) {
                Pair temp = pq.poll();
                if(temp.count == p.count) {
                    temp.count--;
                    count++;
                    pq.add(new Pair(p.c, p.count));
                }
                if(temp.count>0)
                    pq.add(new Pair(temp.c, temp.count));
            }
            // prev = p.count;
            // ctemp = p.c;
        }
        
        return count;
    }
}

class Pair {
    char c;
    int count;
    
    Pair(char c, int count) {
        this.c = c;
        this.count = count;
    }
}