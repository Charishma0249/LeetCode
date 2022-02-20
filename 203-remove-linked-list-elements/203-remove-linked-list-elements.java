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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode node = head;
        if(node==null)
            return node;
        
        // if(node.val==val){
        //     head=node.next;
        //     node = node.next;
        // }
        // if(node==null)
        //     return node;
        
        while(node!=null && node.next!=null){
            if(node.next.val==val){
                node.next = node.next.next;
            }
            else
                node = node.next;
        }
        
        if(head.val==val)
            head = head.next;
        
        return head;
    }
}