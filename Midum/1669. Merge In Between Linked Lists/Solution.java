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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        b -= a;

        while (a > 0) {
            arrayList.add(list1.val);
            list1 = list1.next;
            a--;
        }

        while (list2 != null) {
            arrayList.add(list2.val);
            list2 = list2.next;
        }

        while (b >= 0) {
            list1 = list1.next;
            b--;
        }

        while (list1 != null) {
            arrayList.add(list1.val);
            list1 = list1.next;

        }
        return createList(arrayList);
    }

    private ListNode createList(ArrayList<Integer> values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;

    }
}