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
        ArrayList<Integer> alr = new ArrayList<>();
        dfsL(root.left, all);
        
        
        return dfsR(root.right, all);
        
//         if(all.size()!=alr.size())
//             return false;
        
//         for(int i=0; i<all.size(); i++) {
//             // System.out.println(all.get(i) +" "+alr.get(i));
//             if(all.get(i)!=alr.get(i))
//                 return false;
//         }
        
//         return true;
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
            if(all.get(i)!=null) {
                // System.out.println(all.get(i));
                return false;
            }
            return true;
        }
        // System.out.println(node.val);
        if(all.get(i)==null) {
            // System.out.println("hey -- "+i);
            return false;
        }
        if(all.get(i)!=node.val) {
            // System.out.println(all.get(i)+" " +node.val);
            return false;
        }
        // System.out.println("Hi -- "+all.get(i)+" "+node.val);
        i++;
        res1 = dfsR(node.right, all);
        i++;
        res2 = dfsR(node.left, all);
        
        return res1&&res2;
    }
}