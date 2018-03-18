/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        int termA = 0;
        int termB = 0;

        if (headA == null || headB == null)
            return null;

        while (termA <= 1 && termB <= 1){
            if(A == B)
                return A;
            if(A.next == null) {
                A = headB;
                termA += 1;
            }else
                A = A.next;
            if(B.next == null) {
                B = headA;
                termB += 1;
            }
            else
                B = B.next;
        }
        return null;

    }
}