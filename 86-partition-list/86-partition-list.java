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
        LinkedHashSet<ListNode> smallerElementsHashSet = new LinkedHashSet<>();
        LinkedHashSet<ListNode> greaterElementsHashSet = new LinkedHashSet<>();
        
        if(head==null || head.next==null)
            return head;
        ListNode node = head;
        ListNode resultNode = null, prev=null;
        
        while(node!=null) {
            
            if(node.val<x) {
                smallerElementsHashSet.add(node);
            } else {
                greaterElementsHashSet.add(node);
            }
            node = node.next;
        }
        
        head = resultNode;
        int i=0;
        for(ListNode curNode : smallerElementsHashSet) {
            // resultNode = new ListNode();
            resultNode = curNode;
            if(i==0) {
                head = resultNode;
                i++;
            } else {
                prev.next = resultNode;
            }
            prev = resultNode;
        }
        
        for(ListNode curNode : greaterElementsHashSet) {
            // resultNode = new ListNode();
            resultNode = curNode;
            if(i==0) {
                head = resultNode;
                i++;
            } else {
                prev.next = resultNode;
            }
            prev = resultNode;
        }
        
        resultNode.next = null;
        return head;
    }
}