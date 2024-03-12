import java.util.ArrayList;
import java.util.HashSet;

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

        HashSet<Integer> hashSet = new HashSet<>();
        int num;
        for (int i = 0; i < arrayNode.size(); i++) {
            num = arrayNode.get(i);
            if (num == 0) {
                hashSet.add(i);
                continue;
            }

            for (int j = i + 1; j < arrayNode.size(); j++) {
                num += arrayNode.get(j);
                if (num == 0  && !hashSet.contains(i)) {
                    for (int j2 = i; j2 <= j; j2++) {
                        hashSet.add(j2);
                        // System.out.println(j2);
                    }
                    i++;
                    break;
                }
            }
        }

        ArrayList<Integer> fin = new ArrayList<>();

        for (int i = 0; i < arrayNode.size(); i++) {

            if (!hashSet.contains(i)) {
                fin.add(arrayNode.get(i));
            }
        }

        if (fin.size() == 0) {
            return null;
        }
        ListNode resHead = new ListNode(fin.get(0));
        ListNode s = resHead;
        // System.out.println("after "+fin);
        for (int i = 1; i < fin.size(); i++) {
            s.next = new ListNode(fin.get(i));
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