/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode pOdd = head;
        ListNode pEven = head.next;
        ListNode evenHead = pEven;

        while(pOdd.next != null && pOdd.next.next != null) {
            pOdd.next = pOdd.next.next;
            pOdd = pOdd.next;
            pEven.next = pOdd.next;
            pEven = pEven.next;

        }
        pOdd.next = evenHead;
        return head;

    }
}