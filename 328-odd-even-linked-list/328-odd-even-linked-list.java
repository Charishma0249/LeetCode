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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode oddNode = head, even=head.next;
        ListNode evenNode = new ListNode();
        
        while(oddNode.next!=null){
            // System.out.println("Hey");
            ListNode temp = oddNode.next;
            oddNode.next = temp.next;
            if(oddNode.next!=null)
                oddNode = oddNode.next;
            evenNode.next = temp;
            evenNode = evenNode.next;
        }
        evenNode.next = null;
        oddNode.next = even;
        return head;
    }
}