class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        char[] c;
        String tempstr;
        List<List<String>> res = new ArrayList<List<String>>();
        
        if(strs.length==0)
            return res;
        
        for(String s:strs)
        {            
            c=s.toCharArray();
            
            Arrays.sort(c);
            tempstr = new String(c);
            
            // System.out.println(s);
            // System.out.println(tempstr);
            
            if(map.containsKey(tempstr))
            {
                List<String> ls = map.get(tempstr);
                ls.add(s);
                map.put(tempstr,ls);
            }
            else
            {
                List<String> ls = new ArrayList<String>();
                ls.add(s);
                map.put(tempstr, ls);
            }
        }
        
        for(List<String> ls : map.values())
        {
            res.add(ls);
        }
        
        return res;
    }
}