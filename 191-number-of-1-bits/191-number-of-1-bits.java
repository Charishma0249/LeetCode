public class Solution {
    // you need to treat n as an unsigned value
    HashMap<Integer, Integer> hm = new HashMap<>();
    public int hammingWeight(int n) {
        int count = 0;
        int num=0;
        if(hm.containsKey(n))
            return hm.get(n);
        while(n!=0) {
            int m = n&1;
            count += m;
            hm.put((int)(num+Math.pow(2, m)), count);
            n = n>>>1;
        }
        
        return count;
    }
}