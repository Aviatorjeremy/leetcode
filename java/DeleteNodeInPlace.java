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
        int nextval = node.next.val;
        ListNode next = node.next.next;
        node.val = nextval;
        node.next = next;
    }
}