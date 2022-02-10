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
    int i=0, res=-1;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return res;
    }
    
    public void inorder(TreeNode node, int k){
        
        if(res!=-1)
            return ;
        if(node.left==null && node.right==null) {
            i++;
            if(i==k)
                res = node.val;
            return ;
        }
        
        if(node.left!=null)
            inorder(node.left, k);
        
        i++;
        if(i==k) {
            res = node.val;
            return ;
        }
        
        if(node.right!=null)
            inorder(node.right, k);
    
    }
}