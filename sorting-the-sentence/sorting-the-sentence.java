class Solution {
    public String sortSentence(String s) {
        
        HashMap<Integer, String> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='0' && c<='9')
              hm.put(c-'0', s.substring(j+1, i));
            else if(c==' ')
            { 
                j=i;
                continue;
            }
        }
        
        for(int i=1;i<=hm.size();i++)
        {
            sb.append(hm.get(i));
            if(i<hm.size())
                sb.append(" ");
        }
        
        return sb.toString();
    }
}