class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] count = new int[1000];
        for(int i=0; i<arr.length; i++){
            int c =0;
            if(hm.containsKey(arr[i])){
                c = hm.get(arr[i]);
            }
            
            hm.put(arr[i], c+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            
            if(count[entry.getValue()]>0)
                return false;
            
            count[entry.getValue()]++;
        }
        
        return true;
    }
}