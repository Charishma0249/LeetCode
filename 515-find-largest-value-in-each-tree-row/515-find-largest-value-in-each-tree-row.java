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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        if(root==null)
            return result;
        qu.add(root);
        qu.add(null);
        
        while(!qu.isEmpty()){
            
            TreeNode node = qu.poll();
            
            if(node==null) {
                continue;
            }
            
            max = Math.max(max, node.val);
            if(node.left!=null)
                qu.add(node.left);
            if(node.right!=null)
                qu.add(node.right);
            
            if(qu.peek()==null){
                result.add(max);
                max = Integer.MIN_VALUE;
                qu.add(null);
            }
        }
        
        return result;
    }
}