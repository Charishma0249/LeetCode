class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] n = new int[1001];
        List<Integer> res = new ArrayList<>();
        
        for(int i : nums1){
            n[i]++;
        }
        
        for(int i:nums2){
            if(n[i]>0) {
                res.add(i);
                n[i]--;
            }
        }
        
        int[] intersection = new int[res.size()];
        for(int i=0; i<res.size();i++){
            intersection[i]=res.get(i);
        }
        
        return intersection;
    }
}