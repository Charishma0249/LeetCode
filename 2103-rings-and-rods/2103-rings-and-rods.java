class Solution {
    public int countPoints(String rings) {
        
        HashMap<Integer, int[]> hm = new HashMap<>();
        int res=0;
        
        for(int i=0; i<rings.length(); ) {
            int r = rings.charAt(i+1)-'0';
            char c = rings.charAt(i);
            
            int[] colors = new int[3];
            if(hm.containsKey(r))
                colors = hm.get(r);
            if(c=='R')
                colors[0]++;
            else if(c=='G')
                colors[1]++;
            else
                colors[2]++;
            
            hm.put(r, colors);
            i=i+2;
        }
        
        for(Map.Entry<Integer, int[]> entry : hm.entrySet()) {
            int[] colors = entry.getValue();
            int count =0;
            
            for(int i=0; i<3; i++) {
                if(colors[i]>=1)
                    count++;
            }
            if(count==3)
                res++;
        }
        
        return res;
    }
}