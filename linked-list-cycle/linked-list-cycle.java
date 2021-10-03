/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        LinkedList<ListNode> ll = new LinkedList<>();
        ListNode node = head;
        
        while(node!=null) {
            
            if(ll.contains(node))
                return true;
            
            ll.add(node);
            node = node.next;
        }
        
        return false;
    }
}