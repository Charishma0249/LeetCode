class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int len = index.length;
        int[] res = new int[len];
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0; i<len; i++) {
            al.add(index[i], nums[i]);
        }
        
        for(int i=0; i<len; i++) 
            res[i] = al.get(i);
        
        return res;
    }
}