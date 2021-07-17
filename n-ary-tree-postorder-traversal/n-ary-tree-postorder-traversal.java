/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    List<Integer> res = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        
        rec(root);
        return res;
    }
    
    public void rec(Node n)
    {
        if(n == null)
            return ;
        
        ListIterator<Node> itr = n.children.listIterator();
        
        while(itr.hasNext())
        {
            Node child = itr.next();
            rec(child);
        }
        
        res.add(n.val);
    }
}