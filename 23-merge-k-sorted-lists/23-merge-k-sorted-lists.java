/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode ls=null, res=ls;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
            
            @Override
            public int compare(ListNode ls1, ListNode ls2){
                
                if(ls1.val>ls2.val)
                    return 1;
                else if(ls1.val<ls2.val)
                    return -1;
                return 0;
            }
        });
        
        for(int i=0; i<lists.length; i++){
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            // System.out.println(node.val);
            if(ls==null){
                ls = node;
                res=ls;
            }
            else{
                ls.next = node;
                ls = ls.next;
            }
            if(node.next!=null)
                pq.add(node.next);
            
        }
        // ls.next=null;
        return res;
    }
}