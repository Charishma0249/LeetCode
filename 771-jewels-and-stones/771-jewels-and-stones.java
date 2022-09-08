class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int res=0;
        HashSet<Character> hs = new HashSet<>();
        
        for(char c : jewels.toCharArray()) {
            hs.add(c);
        }
        
        for(char c : stones.toCharArray()) {
           if(hs.contains(c)) {
               res++;
           } 
        }
        
        return res;
    }
}