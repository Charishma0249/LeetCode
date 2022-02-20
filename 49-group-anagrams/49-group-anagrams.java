class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s:strs){
            String sb = countSort(s);
            // System.out.println(sb);
            List<String> ls = new ArrayList<>();
            
            if(hm.containsKey(sb))
                ls = hm.get(sb);
            
            ls.add(s);
            hm.put(sb, ls);
        }
        
        for(Map.Entry<String, List<String>> entry : hm.entrySet()){
            res.add(entry.getValue());
        }
        
        return res;
    }
    
    public String countSort(String s){
        
        int[] alp = new int[26];
        
        for(char c : s.toCharArray()){
            alp[c-'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(alp[i]>0){
                sb.append((char)('a'+i));
                sb.append(alp[i]);
            }
        }
        
        return sb.toString();
    }
}