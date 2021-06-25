class Solution {
    public String reverseVowels(String s) {
        
        int len = s.length();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A'); hs.add('E'); hs.add('O');hs.add('U'); hs.add('I');
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0,j=len-1;i<j;i++,j--)
        {            
            while(!hs.contains(sb.charAt(i)) &&i<j)
                i++;
            while(!hs.contains(sb.charAt(j)) && i<j)
                j--;
            
            if(i<j)
            {
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
            }
        }
        
        return sb.toString();
    }
}