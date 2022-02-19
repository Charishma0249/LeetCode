class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        rec(nums, new ArrayList<Integer>());
        return res;
    }
    
    public void rec(int[] nums, ArrayList<Integer> al){
        
        if(al.size()==nums.length){
            List<Integer> ls = new ArrayList<>(al);
            if(!res.contains(ls))
                res.add(ls);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!al.contains(nums[i])) {
                al.add(nums[i]);
                rec(nums, al);
                al.remove(al.size()-1);
            }
        }
    }
}