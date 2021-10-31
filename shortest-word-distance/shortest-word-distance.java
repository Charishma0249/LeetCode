class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<wordsDict.length; i++) {
            
            if(wordsDict[i].equals(word1) || wordsDict[i].equals(word2)) {
            ArrayList<Integer> al = new ArrayList<>();
                
            if(hm.containsKey(wordsDict[i]))
                al = hm.get(wordsDict[i]);
            
            al.add(i);
            hm.put(wordsDict[i], al);
            }
        }
            
        ArrayList<Integer> al1 = hm.get(word1);
        ArrayList<Integer> al2 = hm.get(word2);
        
        for(int i=0; i<al1.size(); i++) {
            for(int j=0; j<al2.size(); j++) {
                int diff = Math.abs(al1.get(i)-al2.get(j));
                
                if(min>diff)
                    min = diff;
                
            }
                
        }
        
        return min;
    }
}