/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        return preOrderRec(cloned, target);
    }
    
    public TreeNode preOrderRec(TreeNode treeNode, TreeNode target) {
        if(treeNode==null)
            return null;
        
        if(treeNode.val==target.val)
            return treeNode;
        
        TreeNode res1 = preOrderRec(treeNode.left, target);
        TreeNode res2 = preOrderRec(treeNode.right, target);
        
        return (res1 == null) ? res2 : res1;
    }
}