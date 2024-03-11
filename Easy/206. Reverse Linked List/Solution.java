class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = new ListNode();
        ListNode prev = new ListNode();

        while (head != null) {
            current.val = head.val;
            current.next = new ListNode();
            head = head.next;
        }
        return prev;
    }
}

// 1-2-3-null
// 3-2-1-null