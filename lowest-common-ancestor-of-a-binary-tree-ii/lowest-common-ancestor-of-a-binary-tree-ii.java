/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int counter=0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode result = rec(root, p, q, null);
        
        return counter>=2 ? result : null;
    }
    
    public TreeNode rec(TreeNode node, TreeNode p, TreeNode q, TreeNode parent) {
        
        if(node==null)
            return node;
        
        TreeNode res1 = rec(node.left, p, q, node);
        TreeNode res2 = rec(node.right, p, q, node);
        TreeNode res = null;
        
        if(node == p || node==q) {
           // System.out.println(node.val);
            counter++;
            res = node;
        }
        
        if(res1 == null && res2 == null) {
            if(res!=null)
                return res;
            return null;
        }
        else if(res1 == null && res2!=null) {
            if(res!=null)
                return res;
            return res2;
        }
        else if(res1!=null && res2==null) {
            if(res!=null)
                return res;
            return res1;
        }
        else
            return node;
    }
}

// 1. find the nodes from the root
// 2. find the LCA
// 3. if nodes not present, return null