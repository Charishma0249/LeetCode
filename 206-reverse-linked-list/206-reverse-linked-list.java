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
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next==null)
            return head;
        ListNode node = head, prev = null, nextNode;
        
        while(node!=null) {
            // System.out.println(node.val);
            nextNode = node.next;
            
            node.next = prev;
            prev = node;
            node = nextNode;
            
        }
        
        
        return prev;
    }
}