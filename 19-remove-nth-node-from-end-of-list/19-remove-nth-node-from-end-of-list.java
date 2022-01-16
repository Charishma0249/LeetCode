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
        
        // if(n==1) {
        //     head=null;
        //     return head;
        // }
            
        int i=0;
        for(i=0; i<=n && p1!=null; i++) {
            p1=p1.next;
        }
        
        while(p1!=null) {
            p1=p1.next;
            p2=p2.next;
        }
        
        if(p2!=head) {
           // System.out.println(p2.val);
            p1 = p2.next.next;
            p2.next = p1;
        }
        else {
            //System.out.println(p2.val);
            if(i==n+1) {
                //System.out.println(p2.val);
                if(p2.next==null)
                    p2.next = p1;
                else {
                   // System.out.println(p2.val);
                    p1 = p2.next.next;
                    p2.next = p1;
                }
            }
            else if(i==n) {
                head = p2.next;
            }
            else
                head=null;
        }
        
        return head;
    }
}

//         p2    p1
// 1,2,3,4,5,6,7
// 0,1,2,3,4,5,6 -- index
    
// n=3