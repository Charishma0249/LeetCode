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
    int flag =0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> alp = new ArrayList<>();
        ArrayList<TreeNode> alq = new ArrayList<>();
        
        dfs(root, p, alp);
        flag=0;
        dfs(root, q, alq);
        
        if(alp.size()==alq.size()) {
            
            for(int i=0 ; i<alp.size(); i++) {
                if(alp.get(i)==alq.get(i))
                    return alp.get(i);
            }
        }
        else if(alp.size()>alq.size()) {
            for(int i=0; i<alq.size(); i++) {
                if(alp.contains(alq.get(i)))
                    return alq.get(i);
            }
        }
        else {
            for(int i=0; i<alp.size(); i++) {
                if(alq.contains(alp.get(i)))
                    return alp.get(i);
            }
        }
        
        return null;
    }
    
    public void dfs(TreeNode node, TreeNode p, ArrayList<TreeNode> al) {
        
        if(node==null)
            return;
        if(node==p) {
            flag = 1;
            al.add(node);
            return ;
        }
        
        // al.add(node);
        dfs(node.left, p, al);
        if(flag==1) {
            al.add(node);
            return;
        }
        dfs(node.right, p, al);
        if(flag==1) {
            al.add(node);
        }
    }
}