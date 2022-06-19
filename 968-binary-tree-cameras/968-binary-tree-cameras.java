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
    int count = 0;
    public int minCameraCover(TreeNode root) {
        // if(root.left==null && root.right==null)
        //     return 1;
        int val = dfs(root);
        
        if(val==0) {
            // System.out.println(val);
            count++;
        }
        return count;
    }
    
    public int dfs(TreeNode node) {
        
        int left=-1, right=-1;
        
        if(node.left!=null) {
            left = dfs(node.left);
        } 
        if(node.right!=null) {
            right = dfs(node.right);
        }
        
        if ((left==0 && right==0) || (left==0 && right!=0) || (left!=0 && right==0)) {
            node.val = 1;
            count++;
        } 
        
        else if((left<0 && right==1) || (left==1 && right<0) || (left==1 && right==1) || (left==1 && right==2) || (left==2 && right==1)) {
            node.val = 2;
        }
        
        return node.val;
     }
}