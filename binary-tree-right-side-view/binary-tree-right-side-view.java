/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        TreeMap<Integer, List<Integer>> hm = new TreeMap<>();
        List<Integer> result = new ArrayList<>();
        
        int hlevel=0, vlevel=0;
        rec(root, hm, hlevel, vlevel);
        
        for(Map.Entry<Integer, List<Integer>> entry : hm.entrySet()) {
            
            List<Integer> al = entry.getValue();
            result.add(al.get(al.size()-1));
        }
        
        return result;
    }
    
    public void rec(TreeNode node, TreeMap<Integer, List<Integer>> hm, int hlevel, int vlevel) {
        
        if(node==null)
            return ;
        
        List<Integer> al = new ArrayList<>();
        if(hm.containsKey(hlevel)) 
            al = hm.get(hlevel);
        
        al.add(node.val);
        hm.put(hlevel, al);
        
        rec(node.left, hm, hlevel+1, vlevel-1);
        rec(node.right, hm, hlevel+1, vlevel+1);
    }
}

//List<hlevel, List<vlevel, node val>>