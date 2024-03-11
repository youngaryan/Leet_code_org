/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        int count = 0;

        while (first.next != null) {
            count++;
            first = first.next;
        }
        // System.out.println(count);
        if (count == 0) {
            return second;
        }
        count = (count % 2 == 0) ? (count - 1) : (count);

        count /= 2;

        while (count >= 0) {
            second = second.next;
            count--;
        }
        return second;
    }
}