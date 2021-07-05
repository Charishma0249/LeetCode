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
    
    LinkedList<Integer> ls = new LinkedList<>();
    
    public int findSecondMinimumValue(TreeNode root) {
        
        rec(root);
        
        Collections.sort(ls);
        
        if(ls.size()>=2)
            return ls.get(1);
        return -1;
    }
    
    public void rec(TreeNode n)
    {
        if(n==null)
            return ;
        
        int i = n.val;
        if(!ls.contains(i))
            ls.add(n.val);
        
        rec(n.left);
        rec(n.right);
    }
}