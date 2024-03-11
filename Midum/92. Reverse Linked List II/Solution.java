class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        int currentPos = 1;
        ListNode currNode = head, start = head;

        while (currentPos < left) {
            start = currNode;
            currNode = currNode.next;
            currentPos++;
        }

        ListNode newList = null, tail = currNode;

        while (currentPos <= right) {
            ListNode next = currNode.next;
            currNode.next = newList;
            newList = currNode;
            currNode = next;
            currentPos++;
        }

        start.next = newList;
        tail.next = currNode;
        return left == 1 ? newList : head;
    }
}