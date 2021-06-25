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
    
    public int sumRootToLeaf(TreeNode root) {
       
        StringBuilder s=new StringBuilder("");
        rec(root, s);
        
        return res;
        
    }
    
    public StringBuilder rec(TreeNode n, StringBuilder s)
    {
        if(n.left==null && n.right==null)
        {
            s.append(n.val);
            res+=Integer.parseInt(s.toString(), 2);            
            s.deleteCharAt(s.length()-1);
            return s;
        }
        
        s.append(n.val);
       
        if(n.left!=null)
           s = rec(n.left, s);
        if(n.right!=null)
           s = rec(n.right, s);
        
        s.deleteCharAt(s.length()-1);
        return s;
            
    }
}