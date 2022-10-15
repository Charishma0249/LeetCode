class Solution {
    public List<String> cellsInRange(String s) {
        
        String[] str = s.split(":");
        char c1 = str[0].charAt(0);
        char r1 = str[0].charAt(1);
        char c2 = str[1].charAt(0);
        char r2 = str[1].charAt(1);
        
        int cAscii1 = c1;
        int cAscii2 = c2;
        
        List<String> result = new ArrayList<>();
        
        for(int j=c1; j<=c2; j++) {
            for(int i=r1; i<=r2; i++) {
                String temp = new String();
                temp += (char)j;
                temp+=(char)i;
            
                result.add(temp);
            }
        }
        
        return result;
    }
}