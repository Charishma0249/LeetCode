class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int[] res;
        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            if(hs.contains(i) && !al.contains(i))
                al.add(i);
        }
        
        res = new int[al.size()];
        
        for(int i=0; i<al.size(); i++)
            res[i] = al.get(i);
        return res;
    }
}