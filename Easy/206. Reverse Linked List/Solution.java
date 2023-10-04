class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode prev = null;

        while (currentNode != null) {
            // do somthing
            ListNode next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;

            currentNode = next;

        }
        return prev;
    }
}

// 1-2-3-null
// 3-2-1-null