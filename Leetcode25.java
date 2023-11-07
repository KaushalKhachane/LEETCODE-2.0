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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode currentPtr = head;
        ListNode prevPtr = null;
        ListNode next = null;

        int count = 0;
        
        // Count the number of nodes in the current group
        ListNode temp = head;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        
        // If the current group has at least k nodes, reverse it
        if (count >= k) {
            while (count > 0) {
                next = currentPtr.next;
                currentPtr.next = prevPtr;
                prevPtr = currentPtr;
                currentPtr = next;
                count--;
            }
            
            // Recursively reverse the next group and connect it to the current group
            if (next != null) {
                head.next = reverseKGroup(next, k);
            }
            
            // prevPtr is the new head of the reversed group
            return prevPtr;
        } else {
            // If there are fewer than k nodes in the current group, don't reverse it
            return head;
        }
    }
}