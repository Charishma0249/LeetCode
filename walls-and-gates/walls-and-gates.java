class Solution {
    
    int rlen, collen, inf, k,l;
    public void wallsAndGates(int[][] rooms) {
        
        rlen = rooms.length;
        collen = rooms[0].length;
        inf = 2147483647;
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(rooms[i][j]==0)
                {
                    k=i;
                    l=j;
                    rec(rooms, i, j, 0);
                }
            }
        }
    }
    
    public void rec(int[][] rooms, int i, int j, int n)
    {        
        if(i<0 || j<0 || i>=rlen || j>=collen || ((k!=i || l!=j) && rooms[i][j]==0) || rooms[i][j]==-1)
            return ;
        
        if(rooms[i][j]>0)
        {
            if(rooms[i][j]>n)
                rooms[i][j] = n;
            else
                return ;
        }
        
        rec(rooms, i+1, j, n+1);
        rec(rooms, i, j-1, n+1);
        rec(rooms, i-1, j, n+1);
        rec(rooms, i, j+1, n+1);
        
        return ;
    }
}