class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0)
            return 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int max = 1;
        
        int i,j;
        for(i=0, j=0; j<s.length(); ){
            char c = s.charAt(j);
            
            if(!hm.containsKey(c) || (hm.containsKey(c) && hm.get(c)<i)){
                hm.put(c,j);
                j++;
            }
            else{
                // System.out.println("i = "+i+" j = "+j);
                max = Math.max(max, j-i);
                
                i = hm.get(c)+1;
                hm.put(c, j);
                j++;
                
            }
        }
        if(j==s.length())
            max = Math.max(max, j-i);
        return max;
    }
}