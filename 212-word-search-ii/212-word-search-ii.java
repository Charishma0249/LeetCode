class Solution {
    List<String> res = new ArrayList<>();
    int rlen, collen;
    HashSet<String> hs = new HashSet<>();
    HashSet<String> notWords = new HashSet<>();
    
    public List<String> findWords(char[][] board, String[] words) {
        
        rlen = board.length;
        collen = board[0].length;
        
        for(String s : words){
            // if(hs.contains(s) || notWords.contains(s))
            //     continue;
            char c = s.charAt(0);
            
            for(int i=0; i<rlen; i++)
            {
                for(int j=0; j<collen; j++){
                    if(board[i][j]==c) {
                        // System.out.println(s);
                        dfs(board, s, 0, i, j);
                        
                    }
                }
            }
        }
        return res;
    }
    
    public void dfs(char[][] board, String s, int idx, int i, int j){
        
        if(idx>=s.length()){
            if(!hs.contains(s)) {
                hs.add(s);
                res.add(s);
            }
            return ;
        }
        if(i<0 || j<0 || i>=rlen || j>=collen || board[i][j]=='V')
            return ;
        
        
        char c = s.charAt(idx);
        if(board[i][j]!=c)
            return ;
        
        char temp = board[i][j];
        board[i][j]='V';
        dfs(board, s, idx+1, i+1, j);
        dfs(board, s, idx+1, i, j-1);
        dfs(board, s, idx+1, i-1, j);
        dfs(board, s, idx+1, i, j+1);
        board[i][j]=temp;
    }
}