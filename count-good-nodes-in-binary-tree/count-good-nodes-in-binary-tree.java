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
    int res=0;
    public int goodNodes(TreeNode root) {
        
        rec(root, root.val);
        return res;
    }
    
    public void rec(TreeNode n, int max)
    {        
        if(n.val>=max)
        {
            max = n.val;
            res++;
        }
        
        if(n.left!=null)
            rec(n.left, max);
        if(n.right!=null)
            rec(n.right, max);
    }
}