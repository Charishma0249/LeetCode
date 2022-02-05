class Solution {
    public List<String> removeSubfolders(String[] folder) {
        
        List<String> res = new ArrayList<>();
        Arrays.sort(folder);
        res.add(folder[0]);
        
        for(int i=1; i<folder.length; i++) {
            String s = folder[i];
            
            String prev = res.get(res.size()-1);
            int n = s.indexOf(prev);
            if(n==-1 || n!=0 || s.charAt(n+prev.length())!='/')
                res.add(s);
            
        }
        
        return res;
        
    }
}