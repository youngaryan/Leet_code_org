import java.util.ArrayList;

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
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> arrayNode = new ArrayList<>();

        while (head != null) {
            arrayNode.add(head.val);
            head = head.next;
        }

        // System.out.println("before : " + arrayNode);

        int end, start = arrayNode.size() - 1, num;
        for (int i = arrayNode.size() - 1; i >= 0 && start >= 0; i--) {
            i -= (i - start);
            end = i;
            num = arrayNode.get(end);

            for (int j = i - 1; j >= 0; j--) {
                if (num == 0) {
                    start = j;

                    while (end != start) {
                        arrayNode.remove(end);
                        // System.out.println(arrayNode);
                        end--;
                    }

                    break;
                }
                num += arrayNode.get(j);
               
                start = i - 1;
            }
        }
        if (arrayNode.size() == 0) {
            return null;
        }
        // System.out.println("after : " + arrayNode);
        ListNode resHead = new ListNode(arrayNode.get(0));
        ListNode s = resHead;

        for (int i = 1; i < arrayNode.size(); i++) {
            s.next = new ListNode(arrayNode.get(i));
            s = s.next;
        }
        return resHead;
    }
}
/*
 * Input: head = [1,2,3,-3,-2]
 * Output: [1]
 * 
 */