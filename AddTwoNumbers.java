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
        ListNode itr1 = l1;
        ListNode itr2 = l2;
        ListNode solution = new ListNode(0); // return solution.next to skip this placeholder value
        ListNode temp = solution;

        int carry = 0;

        while (itr1 != null || itr2 != null) {
            int n1 = 0;
            int n2 = 0;
            if (itr1 != null) {
                n1 = itr1.val;
                itr1 = itr1.next;
            }
            if (itr2 != null) {
                n2 = itr2.val;
                itr2 = itr2.next;
            }
            int sum = n1 + n2 + carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;
            temp = temp.next;a

        }
        if (carry != 0)
            temp.next = new ListNode(carry);
        return solution.next;
    }
}
