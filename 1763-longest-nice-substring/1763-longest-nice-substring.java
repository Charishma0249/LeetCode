class Solution {
    StringBuilder res = new StringBuilder();
    public String longestNiceSubstring(String s) {
        
        findSubstring(s, 0, s.length(), new StringBuilder());
        return res.toString();
    }
    
    public void findSubstring(String s, int startIdx, int endIdx, StringBuilder sb){
        
        
        if(startIdx+1== endIdx)
            return ;
        HashSet<Character> hs = new HashSet<>();
        for(int i=startIdx; i<endIdx; i++){
            char c = s.charAt(i);
            hs.add(c);
        }
        int i=0;
        for(i = startIdx; i<endIdx; i++){
            char c = s.charAt(i);
            if(hs.contains(Character.toUpperCase(c)) && hs.contains(Character.toLowerCase(c))) {
               sb.append(c); 
               continue;
            }
               
            // if(res.length()<sb.length()){
            //     res = sb;
            // }
            findSubstring(s, startIdx, i, new StringBuilder());
            findSubstring(s, i+1, endIdx, new StringBuilder());
            
            break;
        }
        if(i==endIdx && res.length()<sb.length()){
            // System.out.println()
                res = sb;
            }
    }
}