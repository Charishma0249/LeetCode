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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode parent = root;
        
        for(int i=1; i<preorder.length; i++) {
            
            TreeNode temp = root;
            TreeNode newn = new TreeNode(preorder[i]);
            while(temp!=null) {
                while(temp!=null && temp.val<preorder[i]) {
                    parent = temp;
                    temp = temp.right;
                }
                while(temp!=null && temp.val>preorder[i]) {
                    parent = temp;
                    temp = temp.left;
                }
                
            }
            if(parent.val<preorder[i])
                parent.right = newn;
            else if(parent.val>preorder[i])
                parent.left = newn;
        }
        
        return root;
    }
    
//     public void rec(int[] preorder, int i, TreeNode root) {
        
//         TreeNode temp = root;
//         while(node.left!=null && node.right!=null) {
            
//             if(preorder[i]<temp) {
                
//             }
//         }
//     }
}