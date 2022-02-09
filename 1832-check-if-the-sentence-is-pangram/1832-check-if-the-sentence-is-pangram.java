class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet();
        
        for(char c:sentence.toCharArray()){
           
            hs.add(c);
        }
        
        return (hs.size()==26) ? true : false;
    }
}