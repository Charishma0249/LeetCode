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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        Stack<TreeNode> traverseStack = new Stack<>();
        
        if(root==null) 
            return result;
        
        traverseStack.push(root);
        while(!traverseStack.isEmpty()) {
            TreeNode node = traverseStack.pop();
            
            if( (node.left==null && node.right==null) || visited.contains(node)) {
                result.add(node.val);
                continue;
            } else if(node.left==null && node.right!=null) {
                traverseStack.push(node.right);
                traverseStack.push(node);
            } else if(node.left!=null && node.right==null) {
                traverseStack.push(node);
                traverseStack.push(node.left);
            } else {
                traverseStack.push(node.right);
                traverseStack.push(node);
                traverseStack.push(node.left);
            }
            visited.add(node);
        }
        
        return result;
    }
    
}