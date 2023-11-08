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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Return the list if it's empty or has only one element.
        }

        ListNode sortedList = null; // Initialize a new list for sorted elements.

        while (head != null) {
            ListNode current = head; // Take the current node from the original list.
            head = head.next; // Move to the next unprocessed node.

            if (sortedList == null || current.val < sortedList.val) {
                current.next = sortedList; // Insert at the beginning.
                sortedList = current;
            } else {
                ListNode prev = sortedList;
                while (prev.next != null && current.val >= prev.next.val) {
                    prev = prev.next;
                }
                current.next = prev.next; // Insert between prev and prev.next.
                prev.next = current;
            }
        }

        return sortedList;
    }
}
