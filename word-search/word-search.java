class Solution {
    
    int rlen, collen;
    public boolean exist(char[][] board, String word) {
        
        rlen = board.length;
        collen = board[0].length;
        
        int len = word.length();
        char c = word.charAt(0);
        boolean res = false;
        
        for(int i=0;i<rlen;i++)
        {
            for(int j=0; j<collen; j++)
            {
                if(board[i][j]==c)
                {
                    res = rec(board, word, len, i, j, 0);
                    if(res)
                        return res;
                }
            }
        }
        
        return res;
    }
    
    public boolean rec(char[][] board, String word, int len, int i, int j, int k)
    {
        if(k==len)
            return true;
        
        char c = word.charAt(k);
        
        if(i<0 || j<0 || i>=rlen || j>=collen || board[i][j]!=c)
            return false;
        
        if(board[i][j]==c)
            board[i][j]='0';
        
        boolean b1 = rec(board, word, len, i+1, j, k+1);
        boolean b2 = rec(board, word,len, i, j-1, k+1);
        boolean b3 = rec(board, word, len, i-1, j, k+1);
        boolean b4 = rec(board, word, len, i, j+1, k+1);
        
        board[i][j] = c;
        
        return b1||b2||b3||b4;
    }
}