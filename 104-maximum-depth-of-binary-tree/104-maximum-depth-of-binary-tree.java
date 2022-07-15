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
    public int maxDepth(TreeNode root) {
        
        Queue<TreeNode> inorderQueue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        int max = 1;
        
        if(root==null) {
            return 0;
        }
        
        inorderQueue.add(root);
        depthQueue.add(1);
        while(!inorderQueue.isEmpty()) {
            TreeNode node = inorderQueue.poll();
            int depth = depthQueue.poll();
            
            if(node.left!=null && node.right!=null) {
                inorderQueue.add(node.left);
                inorderQueue.add(node.right);
                depthQueue.add(depth+1);
            } else if(node.left!=null && node.right==null) {
                inorderQueue.add(node.left);
            } else if(node.right!=null && node.left==null) {
                inorderQueue.add(node.right);
            } else {
                continue;
            }
            depthQueue.add(depth+1);
            max = Math.max(max, depth+1);
        }
        
        return max;
    }
 
}