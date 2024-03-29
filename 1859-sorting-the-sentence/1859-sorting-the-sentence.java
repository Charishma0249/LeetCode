class Solution {
    public String sortSentence(String s) {
        
        HashMap<Integer, String> hm = new HashMap<>();
        String[] arr = new String[10];
        String[] str = s.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        for(String temp:str) {
            char c = temp.charAt(temp.length()-1);
            
            // hm.put(c-'0', temp.substring(0, temp.length()-1));
            arr[c-'0'] = temp.substring(0, temp.length()-1);
        }
        
        for(int i=1; i<=str.length; i++) {
            if(arr[i]!=null) {
                result.append(arr[i]);
                result.append(" ");
            }
        }
        
        return result.substring(0, result.length()-1);
    }
}