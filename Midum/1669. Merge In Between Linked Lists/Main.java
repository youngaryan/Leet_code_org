public class Main {
    public static void main(String[] args) {
        int[] list1Values = { 10, 1, 13, 6, 9, 5 };
        int[] list2Values = { 1000000, 1000001, 1000002 };

        ListNode list1 = ListNode.createList(list1Values);
        ListNode list2 = ListNode.createList(list2Values);

        // ListNode.printList(list1);

        // ListNode.printList(list2);
        ListNode res = new Solution().mergeInBetween(list1, 3, 4, list2);
        
        ListNode.printList(res);
    }
}
