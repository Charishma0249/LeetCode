/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        HashMap<Node, Node> hmp = new HashMap<>();
        HashMap<Node, Node> hmq = new HashMap<>();
        ArrayList<Node> alp = new ArrayList<>();
        ArrayList<Node> alq = new ArrayList<>();
        
        rec(p, hmp);
        rec(q, hmq);
        
        Node i=p;
        alp.add(i);
        while(i!=null) {
            alp.add(hmp.get(i));
            i = hmp.get(i);
        }
        
        i=q;
        alq.add(i);
        while(i!=null) {
            
            alq.add(hmq.get(i));
            i = hmq.get(i);
        }
        
        if(alp.size()==alq.size()) {
            int j=0;
            while(alp.get(j)!=alq.get(j)) {
                j++;
            }
            return alp.get(j);
        }
        else if(alp.size()>alq.size()) {
            for(int j=0; j<alq.size(); j++) {
                if(alp.contains(alq.get(j)))
                    return alq.get(j);
            }
        }
        else {
            for(int j=0; j<alq.size(); j++) {
                if(alq.contains(alp.get(j)))
                    return alp.get(j);
            }
        }
        return null;
    }
    
    public void rec(Node p, HashMap<Node, Node> hm) {
        
        if(p.parent == null) {
            hm.put(p, p.parent);
            return ;
        }
        hm.put(p, p.parent);
        rec(p.parent, hm);
    }
}