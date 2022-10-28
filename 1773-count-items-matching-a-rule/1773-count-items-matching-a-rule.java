class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int size = items.size();
        String[] arrType = new String[size];
        String[] arrColor = new String[size];
        String[] arrName = new String[size];
        
        for(int i=0; i<items.size(); i++) {
            arrType[i] = items.get(i).get(0);
            arrColor[i] = items.get(i).get(1);
            arrName[i] = items.get(i).get(2);
        }
        if(ruleKey.equals("type")) {
            return countItems(arrType, ruleValue);
        } else if(ruleKey.equals("color")) {
            return countItems(arrColor, ruleValue);
        } else {
            return countItems(arrName, ruleValue);
        }
    }
    
    public int countItems(String[] arr, String ruleValue) {
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}