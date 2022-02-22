class Solution {
    public int titleToNumber(String columnTitle) {
        
        int len = columnTitle.length();
        int count=0;
        int j= len;
        for(int i=0; i<len; i++){
            
            int n = columnTitle.charAt(i)-'A'+1;
            // System.out.println(" n = "+n+" j = "+j);
            count += Math.pow(26, --j)*n;
        }
        
        return count;
    }
}