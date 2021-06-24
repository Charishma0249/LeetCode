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
    HashSet<Integer> hs = new HashSet<Integer>();
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        int res =0;
        hs = sumRec(root, low, high);
        //hs = sumRec(root, low, high, high);
        
        Iterator itr = hs.iterator();
        
        while(itr.hasNext())
            res+=(int)itr.next();
          //  System.out.println(itr.next());
        
        
        return res;           
            
    }
    
    public HashSet<Integer> sumRec(TreeNode n, int low, int high)
    {
        if(n==null)
            return hs;
        if(n.val<=high && n.val>=low)
               hs.add(n.val);
        
        if(low<=n.val)
            hs = sumRec(n.left, low, high);
        
        if(high>=n.val)
            hs = sumRec(n.right, low, high);
            
        
        return hs;
    }
}