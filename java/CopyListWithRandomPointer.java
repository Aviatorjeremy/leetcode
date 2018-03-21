/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

        RandomListNode dummy = head;

        while (dummy != null){
            map.put(dummy, new RandomListNode(dummy.label));
            dummy = dummy.next;
        }

        dummy = head;
        while (dummy != null){
            map.get(dummy).next = map.get(dummy.next);
            map.get(dummy).random = map.get(dummy.random);
            dummy = dummy.next;
        }
        return map.get(head);

    }
}