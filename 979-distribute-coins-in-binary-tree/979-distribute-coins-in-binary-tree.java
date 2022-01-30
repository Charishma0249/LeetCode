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
    int moves = 0;
    public int distributeCoins(TreeNode root) {
        
        dfs(root);
        
        return moves;
    }
    
    public int dfs(TreeNode node) {
        
        if(node.left==null && node.right==null)
            return node.val-1;
        
        int a =0, b=0;
        if(node.left!=null)
            a = dfs(node.left);
        if(node.right!=null)
            b = dfs(node.right);
        moves += Math.abs(a)+Math.abs(b);
        
        node.val = node.val+a+b;
        return node.val-1;
    }
}