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
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        
        while(root.left!=null || root.right!=null) {
            result.add(addLeavesAndDelete(root, root, new ArrayList<Integer>(), 0));
        }
        result.add(new ArrayList<>(Arrays.asList(root.val)));
        return result;
    }
    
    public List<Integer> addLeavesAndDelete(TreeNode node, TreeNode parent, List<Integer> leaves, int child) {
        
        if(node==null)
            return leaves;
        if(node.left==null && node.right==null) {
            leaves.add(node.val);
            if(child==-1)
                parent.left = null;
            else if(child==1)
                parent.right=null;
            return leaves;
        }
        
        leaves = addLeavesAndDelete(node.left, node, leaves, -1);
        leaves = addLeavesAndDelete(node.right, node, leaves, 1);
        
        return leaves;
    }
}