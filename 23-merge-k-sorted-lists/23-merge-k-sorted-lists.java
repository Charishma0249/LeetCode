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
        
        ListNode result = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<>(){
            
            @Override
            public int compare(ListNode p1, ListNode p2){
                if(p1.val>p2.val)
                    return 1;
                else if(p1.val<p2.val)
                    return -1;
                return 0;
            }
        });
        
        for(int i=0; i<lists.length; i++){
            if(lists[i]!=null)
                pq.add(lists[i]);
        }
        boolean flag = false;
        ListNode prev = result;
        while(!pq.isEmpty()){
            ListNode newn = new ListNode();
            newn = pq.poll();
            if(newn.next!=null)
                pq.add(newn.next);
            if(!flag){
                flag=true;
                result = newn;
            }
            else
                prev.next = newn;
            prev = newn;
        }
        
        return result;
    }
}