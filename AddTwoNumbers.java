/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = parseListNode(l1);
        long num2 = parseListNode(l2);

        long sum = num1 + num2;

        return numberToListNode(sum);
    }

    private static long parseListNode(ListNode root) {
        long num = root.val;
        ListNode temp = root.next;
        int counter = 1;
        while (temp != null) {
            if (temp.val == 0) {
                counter++;
                temp = temp.next;
            }
            num += temp.val * (Math.pow(10, counter));
            temp = temp.next;
            counter++;
        }
        return num;
    }

    private static ListNode numberToListNode(long num) {
        ListNode solution = new ListNode((int) (num % 10));
        num = num / 10;
        ListNode temp = solution;
        while (num != 0) {
            temp.next = new ListNode((int) (num % 10));
            num = num / 10;
            temp = temp.next;
        }
        return solution;
    }
}
