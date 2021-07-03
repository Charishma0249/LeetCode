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
    
   // LinkedList<Integer> ll = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
        
        return rec(root);
        
    }
    
    public boolean rec(TreeNode n)
    {        
        if(n==null)
            return true;            
        
        if(n.left!=null)
        {
        int max = findMax(n.left, Integer.MIN_VALUE);
        if(max<n.val)
        {
            if(n.right!=null)
            {
            int min = findMin(n.right, Integer.MAX_VALUE);
            if(min>n.val)
                return rec(n.left)&&rec(n.right);
            return false;
            }
        }
        
        else
            return false;
        }
        if(n.right!=null)
            {
            int min = findMin(n.right, Integer.MAX_VALUE);
            if(min>n.val)
                return rec(n.left)&&rec(n.right);
            return false;
            }
        return rec(n.left)&&rec(n.right);
    }
    
    public int findMin(TreeNode n, int min)
    {
        if(n==null)
            return min;
        
        if(min>n.val)
            min = n.val;
        min = findMin(n.left, min);
        min = findMin(n.right, min);
        
        return min;
    }
    
    public int findMax(TreeNode n, int max)
    {
        if(n==null)
            return max;
        
        if(max<n.val)
            max = n.val;
        max = findMax(n.left, max);
        max = findMax(n.right, max);
        
        return max;
    }
}