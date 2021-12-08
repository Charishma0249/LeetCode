class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        rec(new ArrayList<>(), 0, nums);
        
        return res;
    }
    
    public void rec(ArrayList<Integer> temp, int i, int[] n) {
        
        if(temp.size()==n.length)
            res.add(new ArrayList<>(temp));
        for(int j=0; j<n.length; j++) {
            
            if(!temp.contains(n[j])) {
                temp.add(n[j]);
            
            rec(temp, j+1, n);
            temp.remove(new Integer(n[j]));
            }
        }
    }
}