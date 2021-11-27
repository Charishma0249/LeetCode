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
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        // if(root.left == null && root.right==null) {
        //     ArrayList<Integer> leaves = new ArrayList<>();
        //     leaves.add(root.val);
        //     res.add(leaves);
        //     return res;
        // }
        
        while(root.left!=null || root.right!=null) {
           // System.out.println(root.val);
            ArrayList<Integer> leaves = new ArrayList<>();
            rec(root, leaves, root);
            res.add(leaves);
        }
        
        ArrayList<Integer> leaves = new ArrayList<>();
        leaves.add(root.val);
        res.add(leaves);
        return res;
    }
    
    
    public void rec(TreeNode node, ArrayList<Integer> al, TreeNode parent) {
        
        if(node==null)
            return ;
            
        if(node.left==null && node.right==null) {
            al.add(node.val);
            
            if(parent.left == node)
                parent.left = null;
            else if(parent.right == node)
                parent.right = null;
            
            return;
        }
        
        rec(node.left, al, node);
        rec(node.right, al, node);
    }
}