class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        rec(candidates, target, 0, new ArrayList<Integer>(), 0);
        return res;
    }
    
    public void rec(int[] arr, int target, int sum, List<Integer> al, int j){
        
        if(sum>=target){
            if(sum==target)
                res.add(new ArrayList<>(al));
            return ;
        }
        
        for(int i=j; i<arr.length; i++){
            al.add(arr[i]);
            rec(arr, target, sum+arr[i], al, i);
            al.remove(al.size()-1);
        }
    }
}