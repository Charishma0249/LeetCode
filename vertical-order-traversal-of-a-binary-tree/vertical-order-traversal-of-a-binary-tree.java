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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> hm = new TreeMap<>();
        int hlevel = 0, vlevel=0;
        List<List<Integer>> result = new ArrayList<>();
        
        rec(root, hm, hlevel, vlevel);
        
        for(Map.Entry<Integer, TreeMap<Integer, List<Integer>>> entry : hm.entrySet()) {
            
            List<Integer> al = new ArrayList<>();
            
            TreeMap<Integer, List<Integer>> tm = entry.getValue();
            
            for(Map.Entry<Integer, List<Integer>> e : tm.entrySet()) {
                List<Integer> tempAl = e.getValue();
                Collections.sort(tempAl);
                al.addAll(tempAl);
                
            }
            result.add(al);
            
        }
        
        return result;
    }
    
    public void rec(TreeNode node, TreeMap<Integer, TreeMap<Integer, List<Integer>>> hm, int hlevel, int vlevel) {
        if(node==null)
            return;
        
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        List<Integer> al = new ArrayList<>();
        
        if(hm.containsKey(vlevel)) {
            tm = hm.get(vlevel);
            if(tm.containsKey(hlevel))
                al = tm.get(hlevel);
        }
        
        al.add(node.val);
        tm.put(hlevel, al);
        hm.put(vlevel, tm);
        
        rec(node.left, hm, hlevel+1, vlevel-1);
        rec(node.right, hm, hlevel+1, vlevel+1);
    }
}