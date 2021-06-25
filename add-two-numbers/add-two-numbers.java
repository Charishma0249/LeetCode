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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode temp1=l1, temp2=l2, temp3=new ListNode();
        ListNode res=temp3, prev=res;
        int sum=-1, c=0, rem;
        
        while(temp1!=null && temp2!=null)
        {
            sum = temp1.val+temp2.val+c;
            
            rem = sum%10;
            c = sum/10;
            
            temp3.val=rem;
            prev.next=temp3;
            prev=temp3;
            temp1=temp1.next;
            temp2=temp2.next;
            
            temp3 = new ListNode();
        }
        
        while(temp1!=null)
        {
            sum = temp1.val+c;
            rem = sum%10;
            c = sum/10;
            temp3.val = rem;
            prev.next=temp3;
            prev=temp3;
            temp1=temp1.next;
            temp3 = new ListNode();
        }
        
        while(temp2!=null)
        {
            sum = temp2.val+c;
            rem = sum%10;
            c = sum/10;
            
            temp3.val = rem;
            prev.next=temp3;
            prev=temp3;
            
            temp2=temp2.next;
            temp3 = new ListNode();
        }
        
        if(c>0)
        {
            temp3.val=c;
            prev.next=temp3;
            prev=temp3;
            return res;
        }
            
        prev.next=null;
        temp3=null;
        return res;
    }
}