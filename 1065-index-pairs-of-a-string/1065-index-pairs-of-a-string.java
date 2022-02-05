class Solution {
    public int[][] indexPairs(String text, String[] words) {
        
        int[][] res;
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.i>p2.i)
                    return 1;
                else if(p1.i<p2.i)
                    return -1;
                else {
                    if(p1.j>p2.j)
                        return 1;
                    else if(p1.j<p2.j)
                        return -1;
                    return 0;
                }
            }
            
        });
        
        for(int i=0; i<words.length; i++) {
            String word = words[i];
            int j=0;
            int len = word.length();
            while(j+len<=text.length()) {
                int idx = text.indexOf(word, j);
                if(idx!=-1) {
                    pq.add(new Pair(idx, idx+len-1));
                    j = idx+1;
                }
                else
                    break;
            }
        }
        
        res = new int[pq.size()][2];
        int i=0;
        while(!pq.isEmpty()) {
            Pair p = pq.poll();
            res[i][0] = p.i;
            res[i][1] = p.j;
            i++;
        }
        
        return res;
    }
}

class Pair{
    
    int i;
    int j;
    
    public Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}