class Solution {
    public String decodeMessage(String key, String message) {
        
        int val = 'a';
        StringBuilder result= new StringBuilder();
        char[] arr = new char[26];
        Arrays.fill(arr, '*');
        
        for(char c: key.toCharArray()) {
            
            if(c!=' ' && arr[c-'a']=='*') {
                arr[c-'a'] = (char)val;
                val++;
            }
        }
        
        for(char c: message.toCharArray()) {
            if(c==' ') {
                result.append(c);
            } else {
                result.append(arr[c-'a']);
            }
        }
        
        return result.toString();
    }
}