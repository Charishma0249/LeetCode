class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        rec(new ArrayList<Integer>(), candidates, target, 0, 0);
        
        return res;
    }
    
    public void rec(ArrayList<Integer> al, int[] n, int target, int sum, int j) {
        
        if(sum>target)
            return ;
        
        ArrayList<Integer> temp = new ArrayList<>(al);
        Collections.sort(temp);
        if(sum == target && !res.contains(temp)) {
            res.add(temp);
        }
        
        
        for(int i=0; i<n.length; i++) {
            
            if(sum>target)
                break;
            sum += n[i];
            temp.add(n[i]);
            
            rec(temp, n, target, sum, i+1);
            sum -= n[i];
            temp.remove(temp.size()-1);
        }
    }
}