public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count =0;
        
        for(char c : str.toCharArray()) {
            if(c=='1')
                count++;
        }
        
        return count;
    }
}