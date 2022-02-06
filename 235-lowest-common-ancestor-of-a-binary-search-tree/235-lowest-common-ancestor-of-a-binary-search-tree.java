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
        
        // HashSet<TreeNode> hs = new HashSet<>();
        // dfs(root, p, hs, false);
        // dfs(root, q, hs, true);
        return dfs(root, p, q);
        // return value;
    }
    
    public TreeNode dfs(TreeNode node, TreeNode p, TreeNode q){
        
        if(node.val>p.val && node.val>q.val)
            return dfs(node.left, p, q);
        else if(node.val<p.val && node.val<q.val)
            return dfs(node.right, p, q);
        
        return node;
    }
    
//     public void dfs(TreeNode node, TreeNode dest, HashSet<TreeNode> hs, boolean flag){
//         if(node==null)
//             return ;
//         if(node==dest){
//             if(!flag)
//                 hs.add(node);
//             else if(flag && hs.contains(node))
//                 value = node;
//             return;
//         }
        
//         if(flag && hs.contains(node))
//                 value = node;
//         if(!flag)
//             hs.add(node);
//         if(dest.val<node.val)
//             dfs(node.left, dest, hs, flag);
//         else if(dest.val>=node.val)
//             dfs(node.right, dest, hs, flag);
//     }
}