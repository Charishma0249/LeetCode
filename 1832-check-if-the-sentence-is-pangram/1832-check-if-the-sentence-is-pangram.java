class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char c:sentence.toCharArray()){
            int count =0;
            if(hm.containsKey(c))
                count = hm.get(c);
            
            hm.put(c, count+1);
        }
        
        return (hm.size()==26) ? true : false;
    }
}