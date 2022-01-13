class Solution {
    public boolean isSubsequence(String s, String t) {
        
        HashMap<Character, PriorityQueue<Integer>> hm = new HashMap<>();
        
        for(int i=0; i<t.length(); i++) {
            
            char c = t.charAt(i);
            //HashSet<Integer> hs = new HashSet<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            if(hm.containsKey(c))
                pq = hm.get(c);
            
            pq.add(i);
            hm.put(c, pq);
        }
        
        int indx = -1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
           // System.out.println(c);
            if(!hm.containsKey(c))
                return false;
            else {
                PriorityQueue<Integer> pq = hm.get(c);
                int temp=indx;
                while(!pq.isEmpty()) {
                    int j = pq.poll();
                    if(j>indx) {
                      //  System.out.println(j);
                        indx=j;
                        break;
                    }
                }
                if(pq.isEmpty() && indx==temp)
                    return false;
            }
        }
        
        return true;
    }
}