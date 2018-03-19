/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // divide linked list into two part
        fast = slow.next;
        slow.next = null;

        ListNode head1 = sortList(head);
        ListNode head2 = sortList(fast);

        return merge(head1, head2);
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null){
            return head2;
        }else if(head2 == null){
            return head1;
        }else if(head1 == null && head2 == null){
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tmp.next = head1;
                head1 = head1.next;
            }else{
                tmp.next = head2;
                head2 = head2.next;
            }
            tmp = tmp.next;
        }

        if(head1 != null) {
            tmp.next = head1;
        }else if(head2 != null){
            tmp.next = head2;
        }

        return dummy.next;

    }
}