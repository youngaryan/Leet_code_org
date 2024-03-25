class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, perv = null, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = perv;
            perv = curr;
            curr = next;

        }

        return perv;
    }
}

// 1-2-3-null
// 3-2-1-null