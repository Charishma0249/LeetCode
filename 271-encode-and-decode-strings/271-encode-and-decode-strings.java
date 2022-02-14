public class Codec {
    HashMap<Integer, List<String>> hm = new HashMap<>();
    
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        // StringBuilder sb = new StringBuilder();
        int hc=0;
        for(int i=0; i<strs.size(); i++){
            // sb.append(strs.get(i));
            hc = (hc+strs.get(i).hashCode())%(100000007);
        }
        String res = String.valueOf(hc);
        hm.put(hc, strs);
        return res;
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        return hm.get(Integer.valueOf(s));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));