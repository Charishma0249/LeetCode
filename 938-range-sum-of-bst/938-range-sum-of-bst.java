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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int sum=0;
        return bst(root, low, high, sum);
        
    }
    
    public int bst(TreeNode node, int low, int high, int sum){
        
        if(node == null)
            return sum;
        
        if(node.val<low)
            sum = bst(node.right, low, high, sum);
        else if(node.val>high)
            sum = bst(node.left, low, high, sum);
        else if(node.val>=low || node.val<=high) {
            sum = sum+node.val;
            sum = bst(node.right, low, high, sum);
            sum = bst(node.left, low, high, sum);
        }
            
        return sum;
    }
}