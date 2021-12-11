class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        rec(candidates, target, 0, new ArrayList<Integer>(), 0);
        return res;
    }
    
    public void rec(int[] n, int target, int sum, ArrayList<Integer> temp, int j) {
        
        if(sum>target)
            return ;
        ArrayList<Integer> al = new ArrayList<>(temp);
        if(sum == target) {
            
            res.add(al);
                return ;
        }
        
        for(int i = j; i<n.length; i++) {
            if(i>j && n[i]==n[i-1])
                continue;
            sum+=n[i];
            temp.add(n[i]);
            rec(n, target, sum, temp, i+1);
            sum-=n[i];
            temp.remove(temp.size()-1);
        }
    }
}