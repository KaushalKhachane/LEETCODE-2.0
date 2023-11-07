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

        // if ll is empty or single node ll then no cycle exists then return false
        if(head == null || head.next == null){
            return false;
        }        
        ListNode slow = head;
        ListNode fast = head;

        // if cycle then for sure slow and fast meet at some node
        while(fast.next != null && fast.next.next != null){
            fast =  fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
    }
}