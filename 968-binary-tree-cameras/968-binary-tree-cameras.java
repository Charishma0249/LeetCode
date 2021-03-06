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
    // int count = 0;
    public int minCameraCover(TreeNode root) {
        // if(root.left==null && root.right==null)
        //     return 1;
        int count = dfs(root, root, 0);
        
        return count;
    }
    
    public int dfs(TreeNode node, TreeNode parent, int count) {
        
        if(node==null) {
            return 0;
        }
        
        int res = dfs(node.left, node, count)+dfs(node.right, node, count)-count;
        
        if(parent.val==1)
            return res;
        
        if( (node.val==0)) {
            parent.val = 1;
            return res+1;
        }
        else if(node.val==1) {
            parent.val = 2;
        }
        return res;
     }
}