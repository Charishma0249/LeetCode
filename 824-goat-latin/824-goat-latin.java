class Solution {
    public String toGoatLatin(String sentence) {
        HashSet<Character> hs = new HashSet<>();
        // (Arrays.asList('a','e','o','u','i','A','E','O','U','I'));
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        String[] str = sentence.split("\\s+");
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<str.length; i++){
            StringBuilder sb = new StringBuilder(str[i]);
            char c = sb.charAt(0);
            if(!hs.contains(c)) {
                sb = new StringBuilder(sb.substring(1));
                sb.append(c);
            }
            sb.append("ma");
            for(int j=0; j<i+1;j++)
                sb.append('a');
            
            res.append(sb);
            res.append(" ");
        }
        return res.substring(0, res.length()-1);
    }
}