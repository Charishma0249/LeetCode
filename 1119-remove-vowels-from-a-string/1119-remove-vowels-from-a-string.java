class Solution {
    public String removeVowels(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray()) {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                continue;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}