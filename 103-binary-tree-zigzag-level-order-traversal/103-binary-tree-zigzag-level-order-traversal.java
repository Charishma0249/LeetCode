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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        qu.add(null);
        int i=0;
        
        while(!qu.isEmpty()){
            Stack<TreeNode> stk = new Stack<>();
            List<Integer> ls = new ArrayList<>();
            if(qu.peek()==null){
                qu.poll();
                continue;
            }
            
            while(!qu.isEmpty()) {
                TreeNode node = qu.poll();
                if(node==null){
                    if(i%2!=0){
                    while(!stk.isEmpty())
                        ls.add(stk.pop().val);
                    }
                    else{
                        for(int j=0; j<stk.size(); j++)
                            ls.add(stk.get(j).val);
                    }
                    res.add(ls);
                    break;
                }
                stk.push(node);
                if(node.left!=null)
                    qu.add(node.left);
                if(node.right!=null)
                    qu.add(node.right);
                    
            }
            qu.add(null);
            i++;
            
        }
        return res;
    }
}