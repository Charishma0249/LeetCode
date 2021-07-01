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
    public int diameterOfBinaryTree(TreeNode root) {
        
        return rec(root);
    }
    
    public int rec(TreeNode n)
    {
        if(n==null)
            return 0;
        
        int lh = height(n.left);
        int rh = height(n.right);
        
        int ld = rec(n.left);
        int rd = rec(n.right);
        
      //  System.out.println("n = "+n.val+" lh = "+lh+" rh="+rh+" ld = "+ld+"rd= "+rd);
        return Math.max(lh+rh, Math.max(ld, rd));
    }
    
    public int height(TreeNode n)
    {
        if(n==null)
            return 0;
        
        int lh = height(n.left);
        int rh = height(n.right);
        
        return 1+Math.max(lh, rh);
    }
}