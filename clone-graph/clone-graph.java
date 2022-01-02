/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return node;
        HashSet<Integer> visited = new HashSet<>();
        Queue<Node> qu = new LinkedList<>();
        HashMap<Integer, Node> hm = new HashMap<Integer, Node>();
        
        //visited.add(node);
        qu.add(node);
        
        while(!qu.isEmpty()) {
            Node n = qu.poll();
            //System.out.println("popped " +n.val);
            if(hm.containsKey(n.val)) 
                continue;
            
            Node newn = new Node();
            List<Node> newl = newn.neighbors;
            
            newn.val = n.val;
            List<Node> nl = n.neighbors;
            
            for(int i=0; i<nl.size(); i++) {
                qu.add(nl.get(i));
            }
          //  System.out.println("not visited " +newn.val);
            hm.put(newn.val, newn);
        }
        //System.out.println("hi");
        // for(int i=1; i<=hm.size();i++)
        //     System.out.println(hm.get(i).val);
        qu.add(node);
       // visited.add(node);
        while(!qu.isEmpty()) {
            Node n = qu.poll();
            if(visited.contains(n.val))
                continue;
            
            List<Node> nl = n.neighbors;
            
            Node newn = hm.get(n.val);
            //System.out.println(newn.val);
            List<Node> newl = newn.neighbors;
            
            for(int i=0; i<nl.size(); i++) {
                qu.add(nl.get(i));
                newl.add(hm.get(nl.get(i).val));
            }
            //System.out.println(n.val);
            hm.put(n.val, newn);
            visited.add(n.val);
        }
        
        
        return hm.get(node.val);
    }
    
}