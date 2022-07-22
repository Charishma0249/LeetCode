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
    public ListNode partition(ListNode head, int x) {
        
        ListNode slowPointer = head, fastPointer = head, fastPrev = head, slowPrev = head;
        
        while(fastPointer!=null) {
            if(fastPointer.val<x && fastPointer!=slowPointer && slowPointer.val<x) {
                
                if(slowPointer.next==fastPointer) {
                    slowPrev = slowPointer;
                    slowPointer = fastPointer;
                    fastPrev = fastPointer;
                    fastPointer = fastPointer.next;
                    continue;
                }
                
                ListNode slowNext = slowPointer.next;
                slowPointer.next = fastPointer;
                fastPrev.next = fastPointer.next; ///
                fastPointer.next = slowNext;
                slowPrev = slowPointer;
                slowPointer = fastPointer;
                fastPointer = fastPrev.next;
            } else if(fastPointer.val<x && fastPointer!=slowPointer && slowPointer.val>=x) {
                
                if(slowPrev == head && slowPrev.val>=x) {
                    head = fastPointer;
                    slowPrev = head;
                } else {
                    slowPrev.next = fastPointer;
                    slowPrev = fastPointer;
                }
                
                fastPrev.next = fastPointer.next;
                fastPointer.next = slowPointer;
                // slowPrev = fastPointer;
                fastPointer = fastPrev.next;
                
                // fastPointer = fastPointer.next;
                // slowPrev.next.next = slowPointer;
                // slowPrev = slowPrev.next;
            }
            else {
                fastPrev = fastPointer;
                fastPointer = fastPointer.next; 
            }
        }
        
        return head;
    }
}