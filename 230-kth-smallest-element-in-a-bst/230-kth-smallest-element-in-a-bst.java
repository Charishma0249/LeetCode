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
    List<Integer> al;
    int i=0, res=-1;
    public int kthSmallest(TreeNode root, int k) {
        // al = new ArrayList<>();
        inorder(root, k);
        return res;
        // return al.get(k-1);
    }
    
    public void inorder(TreeNode node, int k){
        
        if(node.left==null && node.right==null) {
            i++;
            if(i==k)
                res = node.val;
            return ;
        }
        
        if(node.left!=null)
            inorder(node.left, k);
        if(res!=-1)
            return ;
        // al.add(node.val);
        i++;
        if(i==k) {
            res = node.val;
            return ;
        }
        
        if(node.right!=null)
            inorder(node.right, k);
    
    }
}