class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int hor=0, ver=0;
        char dir = 'N';
        
        for(char c : instructions.toCharArray()) {
            
            if(c=='G') {
                if(dir == 'N')
                    ver++;
                else if(dir == 'S')
                    ver--;
                else if(dir == 'W')
                    hor--;
                else 
                    hor++;
            }
            else if(c=='L') {
                if(dir == 'N')
                    dir = 'W';
                else if(dir == 'S')
                    dir = 'E';
                else if(dir == 'W')
                    dir = 'S';
                else if(dir == 'E')
                    dir = 'N';
            }
            else if(c=='R') {
                if(dir == 'N')
                    dir = 'E';
                else if(dir == 'S')
                    dir = 'W';
                else if(dir == 'W')
                    dir = 'N';
                else
                    dir = 'S';
            }
            
        }
        
        if(hor==0 && ver==0 || dir!= 'N')
                return true;
        return false;
    }
}