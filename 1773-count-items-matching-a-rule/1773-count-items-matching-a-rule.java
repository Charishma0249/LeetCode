class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        if(ruleKey.equals("type")) {
            return countItems(items, ruleValue, 0);
        } else if(ruleKey.equals("color")) {
            return countItems(items, ruleValue, 1);
        } else {
            return countItems(items, ruleValue, 2);
        }
    }
    
    public int countItems(List<List<String>> items, String ruleValue, int key) {
        int count = 0;
        
        for(int i=0; i<items.size(); i++) {
            if(items.get(i).get(key).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}