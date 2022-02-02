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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> qu = new LinkedList<>();
        TreeNode node = root;
        
        qu.add(node);
        qu.add(null);
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        while(!qu.isEmpty()) {
            
            TreeNode temp = qu.poll();
            if(temp==null)
                continue;
            al.add(temp.val);
            
            if(temp.left!=null)
                qu.add(temp.left);
            if(temp.right!=null)
                qu.add(temp.right);
            
            if(qu.peek()!=null) {
                continue;
            }
            qu.poll();
            qu.add(null);
            res.add(al);
            al = new ArrayList<>();
        }
        
        return res;
    }
}