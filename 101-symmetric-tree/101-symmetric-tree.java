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
    int i=0;
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> all = new ArrayList<>();
        dfsL(root.left, all);
        
        return dfsR(root.right, all);

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
    
    public boolean dfsR(TreeNode node, ArrayList<Integer> all) {
        
        boolean res1=true, res2=true;
        if(node==null) {
            if(all.get(i)!=null) 
                return false;
            return true;
        }
        
        if(all.get(i)==null || all.get(i)!=node.val) 
            return false;
        
        i++;
        res1 = dfsR(node.right, all);
        i++;
        res2 = dfsR(node.left, all);
        
        return res1&&res2;
    }
}