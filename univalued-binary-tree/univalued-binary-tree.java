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
    
    int val;
    boolean res = true;
    
    public boolean isUnivalTree(TreeNode root) {
        
        val = root.val;
        
        inorderRec(root);
        
        return res;
        
    }
    
    public void inorderRec(TreeNode n)
    {
        if(n==null)
            return;
        
        inorderRec(n.left);
        if(res==false)
            return;
        res = (val==n.val)? true: false;
        
        inorderRec(n.right);
    }
}