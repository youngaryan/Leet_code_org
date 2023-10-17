class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode reverse = new ListNode();

        return null;
    }

    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode prev = null;

        while (currentNode != null) {

            ListNode next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;

            currentNode = next;

        }
        return prev;
    }
}