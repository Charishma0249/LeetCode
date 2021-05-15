class Solution {
    public char[][] rotateTheBox(char[][] box) {
        
        int boxLen = box.length;
        int cellLen = box[0].length;
        int k=0;
        
        char[][] resBox = new char[cellLen][boxLen];
        
        for(int i=0;i<boxLen;i++)
        {
            for(int j=cellLen-1;j>=1;j--)
            {
                if(box[i][j]=='.')
                {                    
                    k=j-1;
                    while(k>=0 && box[i][k]=='.')                      
                        k--;
                    
                    if(k>=0 && box[i][k]=='#')
                    {
                        box[i][j] = '#';
                        box[i][k] = '.';
                    }
                    
                }
                
            }
        }
        
        k=0;
        for(int i=boxLen-1; i>=0; i--)
        {
            for(int j=0;j<cellLen;j++)
            {
                resBox[j][k] = box[i][j];
            }
            k++;
        }
        
        return resBox;
        
    }
}