class Solution {
    public int firstUniqChar(String s) {
        
        int[] arr = new int[26];
        
        for(char c : s.toCharArray()) 
            arr[c-97]++;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(arr[c-97]==1)
                return i;
        }    
        
        return -1;
            
    }
}