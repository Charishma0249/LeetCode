class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        
        for(String s:strings) {
            
            String sb = "";
            for(int i=1; i<s.length(); i++){
                int diff = s.charAt(i)-s.charAt(i-1);
                if(diff<0)
                    sb += (int)(26+diff);
                else
                    sb+=diff;
                sb+='*';
                // sb += s.charAt(i)-s.charAt(i-1);;
            }
             // System.out.println(s+" "+sb);
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
}