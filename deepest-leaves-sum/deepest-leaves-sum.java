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
    
    HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
    
    public int deepestLeavesSum(TreeNode root) {
    
        int high = 0;
        
        if(root.left==null && root.right==null)
            return root.val;
        
        rec(root, high);
        
        for(Map.Entry<Integer, ArrayList<Integer>> entry : hm.entrySet())
        {
            if(high<entry.getKey())
                high = entry.getKey();
        }
        
        ArrayList<Integer> al = hm.get(high);
        Iterator<Integer> itr = al.listIterator();
        
        high=0;
        while(itr.hasNext())
            high+=itr.next();
        
        return high;
    }
    
    public void rec(TreeNode n, int sum)
    {
        if(n==null)
            return ;
        
        sum++;
        if(n.left==null && n.right==null)
        {
            ArrayList<Integer> ls = new ArrayList<>();
            if(hm.containsKey(sum))
                ls = hm.get(sum);
            ls.add(n.val);
            hm.put(sum, ls);
            
            return;
        }
        
        rec(n.left, sum);
        rec(n.right, sum);
            
    }
}