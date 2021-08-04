class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        rec(nums, al, nums.length, 0);
        
        return res;
        
    }
    
    public void rec(int[] nums, ArrayList<Integer> al, int len, int n)
    {     
        
        res.add(new ArrayList<>(al));
        
        for(int i=n; i<len;i++)
        {            
            al.add(nums[i]);
            rec(nums, al, len, i+1);
            al.remove(al.size()-1);
        }
    }
}