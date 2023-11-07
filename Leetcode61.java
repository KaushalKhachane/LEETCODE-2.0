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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        // calculate the length of ll
        ListNode cur = head;
        int len = 1;
        while(cur.next != null){
            len++;
            cur = cur.next;
        }

        //make point last node to first node that is make ll to cll
        cur.next = head;
        //if k > length 
        k = k % len;
        //from belows line k will point to the 3rd node in case of len is 5
        k = len - k;
        
        while(k-- > 0){
            cur = cur.next;
        }
        
        //head is 3rd node.next 
        // and  point cur.next to null
        head = cur.next;
        cur.next = null;

        return head; 
    }
}