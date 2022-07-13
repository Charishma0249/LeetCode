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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        recInorder(root, result);
        
        return result;
    }
    
    public void recInorder(TreeNode node, List<Integer> res) {
        if(node==null)
            return ;
        
        recInorder(node.left, res);
        res.add(node.val);
        recInorder(node.right, res);
    }
}