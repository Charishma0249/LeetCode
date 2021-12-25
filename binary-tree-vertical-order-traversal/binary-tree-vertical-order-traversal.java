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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        
//         PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            
//             @Override
//             public int compare(Pair p1, Pair p2) {
//                 if(p1.x<p2.x)
//                     return 1;
//                 else if(p1.x>p2.x)
//                     return -1;
//                 return 0;
//             }
//         });
        
        TreeMap<Integer, PriorityQueue<Pair>> tm = new TreeMap<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root==null)
            return result;
//         List<Integer> al = new ArrayList<>();
//         if(tm.containsKey(0)) 
//             al = (List<Integer>)tm.get(0);
        
//         al.add(root.val);
//         tm.put(0, al);
        
        bfs(root, 0, tm, 0);
        
        for(Map.Entry<Integer, PriorityQueue<Pair>> entry : tm.entrySet()) {
            List<Integer> al = new ArrayList<>();
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.x>p2.x)
                    return 1;
                else if(p1.x<p2.x)
                    return -1;
                else {
                    if(p1.y>p2.y)
                        return 1;
                    else if(p1.y<p2.y)
                        return -1;
                    return 0;
                }
            }
        });
            pq = entry.getValue();
            while(!pq.isEmpty()) {
                Pair p = pq.poll();
               // System.out.println("val = "+p.val+" x = "+p.x+" y = "+p.y);
                al.add(p.val);
            }
            result.add(al);
        }
        
        return result;
    }
    
    public void bfs(TreeNode node, int i, TreeMap tm, int x) {
        
        if(node==null)
            return ;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.x>p2.x)
                    return 1;
                else if(p1.x<p2.x)
                    return -1;
                else {
                    if(p1.y>p2.y)
                        return 1;
                    else if(p1.y<p2.y)
                        return -1;
                    return 0;
                }
            }
        });
        int c=0;
        if(tm.containsKey(i)) {
            pq = (PriorityQueue<Pair>)tm.get(i);
            c = pq.size();
        }
        
        pq.add(new Pair(node.val, x, c+1));
        tm.put(i, pq);
        
//         if(node.left!=null) {
//             if(tm.containsKey(i-1)) 
//                 al = (List<Integer>)tm.get(i-1);
        
//             al.add(node.left.val);
//             tm.put(i-1, al);
//         }
//         if(node.right!=null) {
//             al = new ArrayList<>();
//             if(tm.containsKey(i+1)) 
//                 al = (List<Integer>)tm.get(i+1);
        
//             al.add(node.right.val);
//             tm.put(i+1, al);
//         }
        
        
        bfs(node.left, i-1, tm, x+1);
        bfs(node.right, i+1, tm, x+1);
    }
}

public class Pair{
    
    int val;
    int x;
    int y;
    
    public Pair() {}
    
    public Pair(int val, int x, int y) {
        this.val = val;
        this.x = x;
        this.y = y;
    }
}