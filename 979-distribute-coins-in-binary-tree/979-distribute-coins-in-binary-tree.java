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
    int count =0;
    public int distributeCoins(TreeNode root) {
        
        rec(root);
        return count;
    }
    
    public int rec(TreeNode node) {
        if(node==null)
            return 0;
        
        int leftCoins = rec(node.left);
        int rightCoins = rec(node.right);
        
        count += Math.abs(leftCoins)+Math.abs(rightCoins);
        
        return leftCoins+rightCoins+node.val-1;
    }
}