/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pRevHead = head;
        ListNode pCurrNode = head;
        ListNode pPrevNode = null;

        while (pCurrNode != null) {
            ListNode pNextNode = pCurrNode.next;
            if (pNextNode == null) {
                pRevHead = pCurrNode;
            }
            pCurrNode.next = pPrevNode;
            pPrevNode = pCurrNode;
            pCurrNode = pNextNode;

        }
        return pRevHead;
    }
}