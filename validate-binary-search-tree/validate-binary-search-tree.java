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
    
    LinkedList<Integer> ll = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
        
        rec(root);
        
        for(int i=1;i<ll.size();i++)
        {
            if(ll.get(i)<=ll.get(i-1))
                return false;
        }
        
        return true;
    }
    
    public void rec(TreeNode n)
    {        
        if(n==null)
            return ;            
        
        rec(n.left);
        ll.add(n.val);
        rec(n.right);    
    
    }
}