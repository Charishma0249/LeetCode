class Solution {
    public boolean canPermutePalindrome(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        int len = s.length();
        
        for(char c : s.toCharArray()) {
            int count =0;
            if(hm.containsKey(c))
                count = hm.get(c);
            
            hm.put(c, count+1);
        }
        
        int co=0, ce=0;
        for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
            
            int val = entry.getValue();
            if(val%2!=0) {
                co++;
                ce += val-1;
            }
            else
                ce += val;
        }
        
        if(co>1)
            return false;
        
        return true;
        
    }
}