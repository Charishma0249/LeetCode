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
        return rec(root.left, subRoot) || rec(root.right, subRoot);
    }
    
    public boolean findIfBothTreesAreSame(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) {
            return true;
        }
        else if((root==null && subRoot!=null) || (root!=null && subRoot==null) || root.val!=subRoot.val) {
            return false;
        }
        
        return findIfBothTreesAreSame(root.right, subRoot.right) && findIfBothTreesAreSame(root.left, subRoot.left);
        
    }
}