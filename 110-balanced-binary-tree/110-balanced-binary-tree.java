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
    
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        
        dfs(root, 0);
        return res;
    }
    
    public int dfs(TreeNode node, int depth) {
        
        if(node==null) 
            return depth;
        
        // System.out.println("depth = "+depth+" node.val = "+node.val);
        int lh = dfs(node.left, depth+1);
        int rh = dfs(node.right, depth+1);
        
        // System.out.println(lh +" "+ rh);
        if(Math.abs(lh-rh)>1)
            res = false;
        
        return Math.max(lh,rh);
    }
}