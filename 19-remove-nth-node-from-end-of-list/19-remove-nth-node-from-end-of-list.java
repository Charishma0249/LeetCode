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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p1 = head,p2=head;
            
        int i=0;
        for(i=0; i<=n && p1!=null; i++) {
            p1=p1.next;
        }
        
        while(p1!=null) {
            p1=p1.next;
            p2=p2.next;
        }
        
        if(p2!=head) {
            p1 = p2.next.next;
            p2.next = p1;
        }
        else {
            if(i==n+1) {
                if(p2.next==null)
                    p2.next = p1;
                else {
                    p1 = p2.next.next;
                    p2.next = p1;
                }
            }
            else {
                head = p2.next;
            }
        }
        
        return head;
    }
}

//         p2    p1
// 1,2,3,4,5,6,7
// 0,1,2,3,4,5,6 -- index
    
// n=3