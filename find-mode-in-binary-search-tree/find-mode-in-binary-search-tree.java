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
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int[] findMode(TreeNode root) {
        
        
        List<Integer> ls = new ArrayList<>();
        
        rec(root);
        
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
        {
           // System.out.println(entry.getKey());
            int val = entry.getValue();
           // System.out.println("val= "+entry.getValue());
            if(ls.size()!=0 && hm.get(ls.get(0))<val)
            {
              //  System.out.println("list= "+ls.get(0));
                ls = new ArrayList<>();
                ls.add(entry.getKey());
            }
            else if(ls.size()==0 || hm.get(ls.get(0))==val)
                ls.add(entry.getKey());
        }
        
        int[] res = new int[ls.size()];
        for(int i=0;i<ls.size();i++)
            res[i]=ls.get(i);
        
        return res;
    }
    
    public void rec(TreeNode n)
    {
        if(n==null)
            return ;
        
        int count =1;
        if(hm.containsKey(n.val))
            count =1+hm.get(n.val);
        hm.put(n.val, count);
        
        rec(n.left);
        rec(n.right);  
        
        return ;
    }
}