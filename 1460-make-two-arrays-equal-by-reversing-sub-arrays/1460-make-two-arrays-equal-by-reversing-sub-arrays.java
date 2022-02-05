class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        
        int tlen = target.length;
        int alen = arr.length;
        if(tlen!=alen)
            return false; 
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : target) {
            int count =0;
            if(hm.containsKey(i))
                count = hm.get(i);
            hm.put(i, count+1);
            
        }
        
        for(int i:arr) {
            if(!hm.containsKey(i) || hm.containsKey(i) && hm.get(i)<=0)
                return false;
            hm.put(i, hm.get(i)-1);
        }
        
        return true;
    }
}