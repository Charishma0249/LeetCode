class Solution {
    
    
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.soldiers<p2.soldiers)
                    return 1;
                else if(p1.soldiers==p2.soldiers && p1.row<p2.row)
                    return 1;
                
                return -1;
            }
        }
        );
                                                     
        int[] res = new int[k];
        
        for(int i=0; i<mat.length; i++)
        {
            int count =0;
            for(int j=0; j<mat[0].length; j++)
            {
                if(mat[i][j]==1)
                    count+=mat[i][j];
                else
                    break;
            }
            
            pq.add(new Pair(i,count));
            
            if(pq.size() > k)
               pq.poll();
        }
        
        
        for(int i=k-1; i>=0; i--)
            res[i] = pq.poll().row;
        
        return res;
    }
}

class Pair{
    
     int row;
     int soldiers;
    
    public Pair(int row, int soldiers)
    {
        this.row = row;
        this.soldiers = soldiers;
    }
}