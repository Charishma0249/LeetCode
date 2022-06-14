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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        return rec(root, subRoot);
    }
    
    public boolean rec(TreeNode root, TreeNode subRoot) {
        
        if(root==null) {
            return false;
        }
        if(root.val==subRoot.val) {
            // System.out.println("hi");
            if(findIfBothTreesAreSame(root, subRoot)) {
                // System.out.println("hi");
                return true;
            }
        }
        boolean r1 = rec(root.left, subRoot);
        boolean r2 = rec(root.right, subRoot);
        
        return r1||r2;
    }
    
    public boolean findIfBothTreesAreSame(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) {
            return true;
        }
        if((root==null && subRoot!=null) || (root!=null && subRoot==null) || root.val!=subRoot.val) {
            return false;
        }
        
        boolean r1 = findIfBothTreesAreSame(root.right, subRoot.right);
        boolean r2 = findIfBothTreesAreSame(root.left, subRoot.left);
        
        return r1&&r2;
    }
}