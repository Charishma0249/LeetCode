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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head, nextNode, temp=null;
        int count=1;
        
        if(left==right)
            return head;
        
        while(count<right) {
            
            if(count==left) {
                ListNode tempPrev = temp, tempCur = node;
                while(count<=right) {
                    // System.out.println(node.val);
                    nextNode = node.next;
                    node.next = tempPrev;
                    tempPrev = node;
                    node = nextNode;
                    count++;
                }
                
                tempCur.next = node;
                if(temp!=null) {
                    temp.next = tempPrev;
                } 
                if(left==1) {
                    return tempPrev;
                }
                
                return head;
            }
            
            temp = node;
            node = node.next;
            count++;
        }
        
        return head;
    }
}