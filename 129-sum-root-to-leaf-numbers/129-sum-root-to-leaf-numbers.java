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
    StringBuilder sb = new StringBuilder();
    int sum=0;
    public int sumNumbers(TreeNode root) {
        dfs(root);
        return sum;
    }
    
    public void dfs(TreeNode node){
        if(node==null)
            return ;
        if(node.left==null && node.right==null){
            sb.append(node.val);
            // System.out.println(sb);
            sum += Integer.valueOf(sb.toString());
            sb.deleteCharAt(sb.length()-1);
            return ;
        }
        
        sb.append(node.val);
        dfs(node.left);
        
        dfs(node.right);
        sb.deleteCharAt(sb.length()-1);
        
        
    }
}