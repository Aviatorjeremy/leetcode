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
    public ListNode detectCycle(ListNode head) {
        ListNode encounter = verifyCycle(head);
        if (encounter == null) return null;

        ListNode slow = head;
        ListNode fast = encounter;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    // verify this linked list whether has a cycle
    public ListNode verifyCycle(ListNode head) {

        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return fast;
        }
        return null;
    }
}