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
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        
        if (n <= 0 || n > size) {
            // Handle invalid n values or n larger than the list size
            return head;
        }

        if (size == 1) {
            // If there is only one node in the list, return null
            return null;
        }

        if(n == size){
            return head.next;
        }

        ListNode prev = head;
        int i = 1;
        int iToFind = size - n;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
        
    }
}