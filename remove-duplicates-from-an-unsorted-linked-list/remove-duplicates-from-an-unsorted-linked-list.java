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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        
        ListNode node = head;
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(node!=null) {
            int count =0;
            if(hm.containsKey(node.val))
                count = hm.get(node.val);
            
            count++;
            hm.put(node.val, count);
            node = node.next;
        }
        
        node = head;
        ListNode prev = head;
        
        while(node!=null) {
            int n= node.val;
            
            if(hm.get(n)>1) {
                
                if(node==head)
                    head = node.next;
                else
                    prev.next = node.next;
                
            }
            else
                prev = node;
            
            node = node.next;
        }
        
        return head;
    }
}