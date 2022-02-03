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
            
            Node currNode = qu.poll();
            
            if(currNode==null)
                continue;
            if(currNode.left!=null)
                qu.add(currNode.left);
            if(currNode.right!=null)
                qu.add(currNode.right);
            
            Node nextNode = qu.peek();
            currNode.next = nextNode;
            
            if(qu.peek()!=null) 
                continue;
            
            qu.poll();
            qu.add(null);
            
        }
        
        return root;
    }
}