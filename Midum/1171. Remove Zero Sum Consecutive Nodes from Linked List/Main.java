public class Main {
    public static void main(String[] args) {

        // ListNode head = new ListNode(1);
        // ListNode s = head;

        // s.next = new ListNode(2);
        // s = s.next;

        // s.next = new ListNode(3);
        // s = s.next;

        // s.next = new ListNode(-3);
        // s = s.next;

        // s.next = new ListNode(-2);

        // ListNode re = new Solution().removeZeroSumSublists(head);
        // // System.out.println(new Solution().removeZeroSumSublists(s));

        // while (re != null) {
        // // System.out.println(re.val);
        // re = re.next;

        // }

        ListNode head = new ListNode(1);
        ListNode s = head;

        s.next = new ListNode(2);
        s = s.next;

        s.next = new ListNode(-3);
        s = s.next;

        s.next = new ListNode(3);
        s = s.next;

        s.next = new ListNode(1);

        ListNode re = new Solution().removeZeroSumSublists(head);
        // System.out.println(new Solution().removeZeroSumSublists(s));

        while (re != null) {
        System.out.println(re.val);
        re = re.next;

        }

        // ListNode head = new ListNode(1);

        // ListNode s = head;

        // s.next = new ListNode(-1);

        // ListNode re = new Solution().removeZeroSumSublists(head);
        // // System.out.println(new Solution().removeZeroSumSublists(s));

        // while (re != null) {
        // System.out.println(re.val);
        // re = re.next;

        // }

        // ListNode head = new ListNode(0);

        // ListNode re = new Solution().removeZeroSumSublists(head);
        // // System.out.println(new Solution().removeZeroSumSublists(s));

        // while (re != null) {
        // System.out.println(re.val);
        // re = re.next;

        // }

        // ListNode head = new ListNode(2);

        // ListNode s = head;

        // s.next = new ListNode(0);

        // ListNode re = new Solution().removeZeroSumSublists(head);
        // // System.out.println(new Solution().removeZeroSumSublists(s));

        // while (re != null) {
        // System.out.println(re.val);
        // re = re.next;

        // }

        // ListNode head = new ListNode(-1);
        // ListNode s = head;

        // s.next = new ListNode(1);
        // s = s.next;

        // s.next = new ListNode(0);
        // s = s.next;

        // s.next = new ListNode(1);

      
        // ListNode re = new Solution().removeZeroSumSublists(head);
        // // System.out.println(new Solution().removeZeroSumSublists(s));

        // while (re != null) {
        // System.out.println(re.val);
        // re = re.next;

        // }

    }
}
// 1,2,3,-3,-2
// 1,2,-3,3,1
// 1,-1
// 0