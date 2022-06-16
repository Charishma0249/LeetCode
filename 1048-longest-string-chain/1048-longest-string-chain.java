class Solution {
    int maxLen =0;
    public int longestStrChain(String[] words) {
        
        int len=0;
        HashMap<String, Integer> hm = new HashMap<>();
        // System.out.println(words.length);
        
        for(String s:words) {
            hm.put(s, 0);
        }
        for(int i=0; i<words.length; i++) {
            rec(words, hm, words[i], 0);
        }
        
        // for(Map.Entry<String, Integer> entry : hm.entrySet()) {
        //     System.out.println(entry.getKey() +" "+ entry.getValue());
        //     // len++;
        // }
        // System.out.println(len);
        return maxLen;
    }
    
    public int rec(String[] words, HashMap<String, Integer> hm, String word, int len) {
        
        if(!hm.containsKey(word)) {
            return 0;
        }
        
        if(hm.get(word)>0) {
            return hm.get(word);
        }
        len++;
        int localMax=0;
        for(int i=0; i<word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb = sb.deleteCharAt(i);
            int rlen = rec(words, hm, sb.toString(), len);
            localMax = Math.max(localMax, rlen);
        }
        localMax++;
        hm.put(word, localMax);
        // System.out.println(word+" "+localMax);
        maxLen = Math.max(localMax, maxLen);
        return localMax;
    }
}