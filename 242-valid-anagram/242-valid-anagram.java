class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        int slen = s.length();
        int tlen = t.length();
        
        if(slen!=tlen)
            return false;
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        // System.out.println();
        String sorteds = new String(sarr);
        String sortedt = new String(tarr);
        // System.out.println(sorteds);
        // System.out.println(sortedt);
        return sorteds.equals(sortedt);
        // return true;
    }
}