class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            int c =0;
            if(hm.containsKey(arr[i])){
                c = hm.get(arr[i]);
            }
            
            hm.put(arr[i], c+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            
            int val = entry.getValue();
            if(hs.contains(val))
                return false;
            hs.add(val);
        }
        
        return true;
    }
}