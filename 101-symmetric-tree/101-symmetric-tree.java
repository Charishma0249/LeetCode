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
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> alr = new ArrayList<>();
        dfsL(root.left, all);
        dfsR(root.right, alr);
        
        if(all.size()!=alr.size())
            return false;
        
        for(int i=0; i<all.size(); i++) {
            // System.out.println(all.get(i) +" "+alr.get(i));
            if(all.get(i)!=alr.get(i))
                return false;
        }
        
        return true;
    }
    
    public void dfsL(TreeNode node, ArrayList<Integer> all) {
        
        if(node==null) {
            all.add(null);
            return ;
        }
        
        all.add(node.val);
        dfsL(node.left, all);
        dfsL(node.right, all);
    }
    
    public void dfsR(TreeNode node, ArrayList<Integer> alr) {
        
        if(node==null) {
            alr.add(null);
            return ;
        }
        // System.out.println(node.val);
        alr.add(node.val);
        dfsR(node.right, alr);
        dfsR(node.left, alr);
    }
}