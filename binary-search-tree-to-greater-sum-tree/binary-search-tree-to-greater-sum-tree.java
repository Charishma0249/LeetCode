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
    
   // ArrayList<Integer> al = new ArrayList<Integer>();
    
    LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
    int sum =0;
    
    public TreeNode bstToGst(TreeNode root) {
     
        TreeNode temp = root;
        int n;
    
        if(root.left==null && root.right==null)
            return root;
        
        recIterate(temp);
    
        Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();
        
        while(itr.hasNext())
        {
            Map.Entry<Integer, Integer> entry = itr.next();
            
            n = entry.getValue();
            hm.put(entry.getKey(), sum);
            sum = sum-n;
        }
        recUpdate(temp);
        
        return root;
    }
    
    public void recIterate(TreeNode n)
    {
        if(n==null)
            return ;
        
        recIterate(n.left);
        
        hm.put(n.val, n.val);
        sum+=n.val;
        
        recIterate(n.right);
        
        return ;        
    }
    
    public void recUpdate(TreeNode n)
    {
        if(n==null)
            return ;
        
        n.val = hm.get(n.val);
        
        recUpdate(n.left);
        recUpdate(n.right);
        
        return ;
    }
}