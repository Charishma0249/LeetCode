/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Queue<Node> qu = new LinkedList<>();
        
        Node node = root;
        qu.add(node);
        qu.add(null);
        
        while(!qu.isEmpty()) {
            Node temp = qu.poll();
            
            if(temp==null)
                continue;
            
            if(temp.left!=null)
                qu.add(temp.left);
            if(temp.right!=null)
                qu.add(temp.right);
            
            if(qu.peek()!=null) {
                Node nextNode = qu.peek();
                temp.next = nextNode;
                continue;
            }
            
            qu.poll();
            temp.next = null;
            qu.add(null);
            
        }
        
        return root;
    }
}