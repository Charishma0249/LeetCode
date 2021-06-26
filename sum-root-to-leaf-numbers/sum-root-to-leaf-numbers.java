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
    
    int sum=0;
    public int sumNumbers(TreeNode root) {
        
        return rec(root, "");
    }
    
    public int rec(TreeNode n, String s)
    {
        if(n.left==null & n.right==null)
        {
            s=s+n.val;
            //System.out.println(s);
            sum+=Integer.parseInt(s);
            return sum;
        }
        
        if(n.left!=null)
            rec(n.left, s+n.val);
        
        if(n.right!=null)
            rec(n.right, s+n.val);
        
        return sum;
    }
}