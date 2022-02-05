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
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return res;
        Stack<TreeNode> stk = new Stack<>();
        stk.add(root);
        HashSet<TreeNode> visited = new HashSet<>();
        
        while(!stk.isEmpty()){
            TreeNode node = stk.pop();
                
            if(visited.contains(node) || node.left==null && node.right==null)
                res.add(node.val);
            else if(node.right!=null || node.left!=null){
                stk.push(node);
                if(node.right!=null)
                    stk.push(node.right);
                if(node.left!=null)
                    stk.push(node.left);
            }
            visited.add(node);
        }
        // dfs(root);
        return res;
    }
    
//     public void dfs(TreeNode node){
//         if(node==null)
//             return ;
        
//         dfs(node.left);
//         dfs(node.right);
//         res.add(node.val);
//     }
}