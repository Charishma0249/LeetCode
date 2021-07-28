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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode node = head, temp = node;
        int value = 1000;
        while(node!=null)
        {
            if(node.val == value)
            {
                temp.next = node.next;
                node = temp;
            }
            value = node.val;
            temp = node;
            node = node.next;
            
        }
            
        return head;
    }
}