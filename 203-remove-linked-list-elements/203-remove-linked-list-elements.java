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
        
        ListNode node = head, prev = head;
        
        while(node!=null){
            if(node.val==val){
                if(node==head)
                    head=node.next;
                else
                    prev.next=node.next;
            }
            else
                prev = node;
            node = prev.next;
        }
        
        return head;
    }
}