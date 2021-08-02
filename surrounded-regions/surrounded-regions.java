class Solution {
    
    int rlen, collen;
    public void solve(char[][] board) {
        
        rlen = board.length;
        collen = board[0].length;
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen;)
            {
                if(board[i][j]=='O')
                    board = rec(board, i, j, 'P');
                
                if(i>0 && i<rlen-1)
                    j = j+collen-1;
                else
                    j++;
            }
        }
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(i>0 && i<rlen-1 && board[i][j]=='O')
                    board = rec(board, i, j, 'X');
            }
        }
        
        for(int i=0; i<rlen; i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(board[i][j]=='P')
                    board[i][j]='O';
            }
        }
    }
    
    public char[][] rec(char[][] board, int i, int j, char c)
    {
        if(i<0 || j<0 || i>=rlen || j>=collen || board[i][j]!='O')
            return board;
        
        if(board[i][j]=='O')
            board[i][j] = c;
        
        board = rec(board, i+1, j, c);
        board = rec(board, i, j-1, c);
        board = rec(board, i-1, j, c);
        board = rec(board, i, j+1, c);
        
        return board;
    }
    
}