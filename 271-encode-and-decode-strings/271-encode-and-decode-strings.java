public class Codec {
    HashMap<Integer, List<String>> hm = new HashMap<>();
    
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i));
        }
        
        hm.put(sb.toString().hashCode(), strs);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        return hm.get(s.hashCode());
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));