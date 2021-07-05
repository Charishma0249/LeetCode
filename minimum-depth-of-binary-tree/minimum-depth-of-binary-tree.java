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
    
    int depth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        rec(root, 0);
        
        return depth;
    }
    
    public void rec(TreeNode n, int sum)
    {
        if(n==null)
            return ;
        
        sum++;
        
        if(n.left==null && n.right==null)
        {
            if(depth>sum)
                depth=sum;
            
            return ;
        }
        
        rec(n.left, sum);
        rec(n.right, sum);
    }
}