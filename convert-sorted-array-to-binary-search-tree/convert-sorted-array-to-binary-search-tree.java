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
    HashSet<Integer> hs = new HashSet<>();
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int len = nums.length;
        TreeNode root = new TreeNode(nums[len/2]);
        hs.add(len/2);
        
        rec(nums, 0, len/2, len-1, root);
        return root;
    }
    
    public void rec(int[] nums, int low, int mid, int high, TreeNode node) {
        
        if(low==high)
            return ;
        
        int l = (low+mid)/2;
        int r = (mid+high+1)/2;
        
        if(!hs.contains(l)) {
            node.left = new TreeNode(nums[l]);
            hs.add(l);
            rec(nums, low, l, mid, node.left);
        }
        else
            node.left = null;
        
        if(!hs.contains(r)) {
            node.right = new TreeNode(nums[r]);
            hs.add(r);
            rec(nums, mid, r, high, node.right);
        }
        else
            node.right = null;
        
    }
}