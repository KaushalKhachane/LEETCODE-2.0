/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null) return;
        // if the node is the last node to delete then simply make that node null
        if(node.next ==  null) {
            node = null;
        }
        simply traverse (not traverse actually) right of given node
        node.val = node.next.val;
        node.next = node.next.next;
    }
}