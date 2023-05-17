/*
 * 2130. Maximum Twin Sum of a Linked List
 */

public class TwinSum {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> s = new Stack<Integer>();
        while (fast != null) {
            s.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        int max = Integer.MIN_VALUE;
        while (slow != null) {
            max = Math.max(max, s.pop() + slow.val);
            slow = slow.next;
        }
        return max;
    }
}
