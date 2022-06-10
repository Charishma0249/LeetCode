class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        int max = 0, i=0, j=1;
        HashMap<Character, Integer> visited = new HashMap<>();
        
        if(len <=1) {
            return len;
        }
        
        visited.put(s.charAt(0), 0);
        for(i=0, j=i+1; i<=j && j<len; ) {
            char c = s.charAt(j);
            
            if(visited.containsKey(c) && visited.get(c)>=i) {
                max = Math.max(max, j-i);
                // System.out.println("max = "+max+" i = "+i+" j = "+j);
                i = visited.get(c)+1;
                // count = j-i+1;
            }
            
            visited.put(c, j);
            j++;
        }
        
        // System.out.println(max);
        return Math.max(max, j-i);
    }
}