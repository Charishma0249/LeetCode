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
        
        while(root!=null) {
            List<Integer> al;
            if(root.left==null && root.right==null) {
                al = new ArrayList<>();
                al.add(root.val);
                res.add(al);
                break;
            }
            
            al = new ArrayList<>();
            rec(root, al, root, 0);
            
            res.add(al);
            
        }
        return res;
    }
    
    public void rec(TreeNode node, List<Integer> al, TreeNode parent, int i) {
        
        if(node==null)
            return ;
        if(node.left==null && node.right==null) {
            al.add(node.val);
            if(i==-1)
                parent.left=null;
            else if(i==1)
                parent.right=null;
            return ;
        }
        
        rec(node.left, al, node, -1);
        rec(node.right, al, node, 1);
    }
}