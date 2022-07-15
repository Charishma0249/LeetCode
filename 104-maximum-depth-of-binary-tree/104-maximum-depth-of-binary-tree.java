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
    public int maxDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        
        return Math.max(maxDepth(root.left)+1, maxDepth(root.right)+1);
    }
    
//     public int rec(TreeNode node) {
//         if(node==null) {
//             return 0;
//         }
        
//         int leftDepth = rec(node.left)+1;
//         int rightDepth = rec(node.right)+1;
        
//         return Math.max(leftDepth, rightDepth);
//     }
}