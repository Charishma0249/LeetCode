class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        ArrayList<String> temp = new ArrayList<>();
        
        for(int i=0; i<arr1.length; i++) {
            int count =1;
            if(hm.containsKey(arr1[i]))
                count = hm.get(arr1[i])+1;
            
            hm.put(arr1[i],count);
        }
        
        for(int i=0; i<arr2.length; i++) {
            int count =1;
            if(hm.containsKey(arr2[i]))
                count = hm.get(arr2[i])+1;
            
            hm.put(arr2[i], count);
        }
        
        for(Map.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue()==1)
                temp.add(entry.getKey());
        }
        
        return temp.toArray(new String[temp.size()]);
        
    }
}