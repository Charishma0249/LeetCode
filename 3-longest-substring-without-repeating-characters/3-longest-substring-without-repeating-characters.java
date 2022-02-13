class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length();
        int max = Integer.MIN_VALUE;
        if(len==0)
            return 0;
        hm.put(s.charAt(0), 0);
        int i,j;
        
        for(i=0, j=1; j<len; ) {
            
            char cj = s.charAt(j);
            if(hm.containsKey(cj) && hm.get(cj)>=i){
                max = Math.max(max, j-i);
                i=hm.get(cj);
                i++;
            }
            hm.put(cj, j);
            j++;
        }
        if(j==len)
            max = Math.max(max, j-i);
        return max == Integer.MIN_VALUE ? 1 : max;
    }
}