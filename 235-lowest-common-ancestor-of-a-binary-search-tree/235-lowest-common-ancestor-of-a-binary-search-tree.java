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
    TreeNode value;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // List<Integer> pl = new ArrayList<>();
        // List<Integer> ql = new ArrayList<>();
        
        HashSet<TreeNode> hs = new HashSet<>();
        dfs(root, p, hs, false);
        dfs(root, q, hs, true);
        
        return value;
    }
    
    public void dfs(TreeNode node, TreeNode dest, HashSet<TreeNode> hs, boolean flag){
        if(node==null || node==dest){
            if(!flag)
                hs.add(node);
            else if(flag && hs.contains(node))
                value = node;
            return;
        }
        
        if(flag && hs.contains(node))
                value = node;
        if(!flag)
            hs.add(node);
        if(dest.val<node.val)
            dfs(node.left, dest, hs, flag);
        else if(dest.val>=node.val)
            dfs(node.right, dest, hs, flag);
    }
}