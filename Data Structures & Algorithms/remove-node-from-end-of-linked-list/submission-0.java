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

        ListNode dummy = head;
        ListNode temp = head;
        int counter = 1;

        if (n == 0) return head;
        if (n == 1 && head.next == null) return null;
        
        while (counter <= n) {
            dummy = dummy.next;
            counter++;
        }

        if (dummy == null) return head.next;

        while (dummy.next != null) {
            dummy = dummy.next;
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;

    }
}
