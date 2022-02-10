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
    List<Integer> al;
    public int kthSmallest(TreeNode root, int k) {
        al = new ArrayList<>();
        inorder(root);
        
        return al.get(k-1);
    }
    
    public void inorder(TreeNode node){
        
        if(node==null)
            return ;
        
        inorder(node.left);
        al.add(node.val);
        inorder(node.right);
    }
}