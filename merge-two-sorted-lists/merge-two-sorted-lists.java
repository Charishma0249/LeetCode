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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(), l3 = new ListNode();
        int i=0;
        while(l1!=null && l2!=null) {
            
                ListNode temp = new ListNode();
                if(l1.val==l2.val) {
                    temp.val = l1.val;
                    
                    l3.next = temp;
                    
                    if(i==0)
                        head=l3;
                    
                    l3 = temp;
                    temp = new ListNode();
                    temp.val = l2.val;
                    l1 = l1.next;
                    l2 = l2.next;
                    i++;
                }
                
                else if(l1.val<l2.val) {
                    temp.val = l1.val;
                    l1=l1.next;
                }
                
                else {
                    temp.val = l2.val;
                    l2=l2.next;
                }
                
                l3.next=temp;
                
            if(i==0)
                head=l3;
            i++;
            
            l3=temp;
        }
        
        while(l1!=null) {
            
            ListNode temp = new ListNode();
            temp.val = l1.val;
            
            l3.next = temp;
            
            if(i==0)
                head=l3;
            
            l3 = temp;
            
            l1=l1.next;
            i++;
        }
        
        while(l2!=null) {
            
            ListNode temp = new ListNode();
            
            temp.val = l2.val;
            l3.next = temp;
            
            if(i==0)
                head=l3;
            
            l3=temp;
            
            l2=l2.next;
            i++;
        }
        
        if(i==0)
            return null;
        // if(i==1)
        //     return head.next;
        return head.next;
    }
}