class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        ArrayList<String> arrType = new ArrayList<>();
        ArrayList<String> arrColor = new ArrayList<>();
        ArrayList<String> arrName = new ArrayList<>();
        
        for(int i=0; i<items.size(); i++) {
            arrType.add(items.get(i).get(0));
            arrColor.add(items.get(i).get(1));
            arrName.add(items.get(i).get(2));
        }
        if(ruleKey.equals("type")) {
            return countItems(arrType, ruleValue);
        } else if(ruleKey.equals("color")) {
            return countItems(arrColor, ruleValue);
        } else {
            return countItems(arrName, ruleValue);
        }
    }
    
    public int countItems(List<String> al, String ruleValue) {
        int count = 0;
        
        for(int i=0; i<al.size(); i++) {
            if(al.get(i).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}