/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = new ListNode(0);
        i.next = head;
        ListNode j = new ListNode(0);
        j.next = head;
        ListNode ret = j;
        int dis = 0;

        while (i.next != null) {
            if(dis != n) {
                i = i.next;
                dis++;
                continue;
            }else{
                i = i.next;
                j = j.next;
            }
        }


        j.next = j.next.next;


        return ret.next;
    }
}