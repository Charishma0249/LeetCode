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
    
    boolean res=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return res;
        return inorderRec(root, targetSum, 0);  
    }
    
    public boolean inorderRec(TreeNode n, int target, int sum)
    {
        //System.out.println(n.val);
        if(n.left==null && n.right==null)
        {
            if(sum+n.val==target)
                return true;
            else 
                return false;
        }
        
        if(n.left!=null)
            res = inorderRec(n.left, target, sum+n.val);
        
        
        return res ? true : ((n.right!=null)? inorderRec(n.right, target, sum+n.val):false);
        
    }
}