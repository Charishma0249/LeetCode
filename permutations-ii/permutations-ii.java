class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        int[] visited = new int[nums.length];
        Arrays.sort(nums);
        
        //System.out.println(nums);
        rec(new ArrayList<Integer>(), nums, visited);
        return res;
    }
    
    public void rec(ArrayList<Integer> temp, int[] n, int[] v) {
        
        ArrayList<Integer> al = new ArrayList<Integer>(temp);
        if(temp.size() == n.length && !res.contains(al))
            res.add(al);
        
        for(int i=0; i<n.length; i++) {
            
            if(v[i]==0) {
                v[i]=1;
                temp.add(n[i]);
                rec(temp, n, v);
                temp.remove(temp.size()-1);
                
                v[i]=0;
            }
        }
    }
}