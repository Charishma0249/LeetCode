class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        
        int[] temp = new int[len];
        HashMap<Integer, Integer> hm = new HashMap<>();
        // int[] result = new int[len];
        
        for(int i=0; i<len; i++) {
            temp[i] = nums[i];
        }
        
        Arrays.sort(temp);
        
        hm.put(temp[0], 0);
        for(int i=1; i<len; i++) {
            if(temp[i]!=temp[i-1]) {
                hm.put(temp[i], i);
            }
        }
        
        for(int i=0; i<len; i++) {
            temp[i] = hm.get(nums[i]);
        }
        
        return temp;
    }
}