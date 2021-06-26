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
    
    TreeNode res;
    TreeNode prev, main;
    int flag=0;
    public TreeNode increasingBST(TreeNode root) {
        
        prev = inorder(root);
        
        return main;
    }
    
    public TreeNode inorder(TreeNode n)
    {
        
        if(n.left==null && n.right==null)
        {
            res = new TreeNode();
            res.val=n.val;
            
            if(flag==0)
            {
                flag=1;
                main = res;
                
                return res;
            }     
            
            prev.right=res;
            prev.left=null;
            return res;
        }
        
        if(n.left!=null)
            prev = inorder(n.left);
        
        res = new TreeNode();
        res.val=n.val;
        if(flag==0)
        {
            flag=1;
            main=res;
        }
        else
        {
            prev.right=res;
            prev.left=null;
        }
        prev=res;
        
        if(n.right!=null)
            prev = inorder(n.right);
            
        return res;
    }
}