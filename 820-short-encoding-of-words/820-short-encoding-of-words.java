class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        StringBuilder sb = new StringBuilder();
        // String str = "";

        Arrays.sort(words, (a, b)->Integer.compare(b.length(), a.length()));
        
        for(String word : words) {
            int wlen = word.length();
            int slen = sb.length();
            
            String encodedWord = word+"#";
            int index = sb.indexOf(encodedWord);
            // System.out.println(encodedWord);
            // System.out.println(index+wlen);
            // System.out.println("sb == "+sb.length());
            if(index==-1) {
                sb.append(word);
                sb.append("#");
            }
        }
        
        // System.out.println(sb);
        return sb.length();
    }
}