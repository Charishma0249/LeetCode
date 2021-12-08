class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        rec(new ArrayList<Integer>(), 0, nums);
        
        return res;
    }
    
    public void rec(ArrayList<Integer> temp, int i, int[] n) {
        
        ArrayList<Integer> al = new ArrayList<>(temp);
        
        if(!res.contains(al))
            res.add(new ArrayList<>(temp));
        
        for(int j=i; j<n.length; j++) {
            temp.add(n[j]);
            rec(temp, j+1, n);
            temp.remove(new Integer(n[j]));
        }
    } 
}