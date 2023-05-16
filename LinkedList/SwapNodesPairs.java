/*
 * 24. Swap Nodes in Pairs
 */

public class SwapNodesPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode curr = ans;
        while (curr.next != null && curr.next.next != null) {
            ListNode t1 = curr.next;
            ListNode t2 = curr.next.next;
            curr.next = t2;
            t1.next = t2.next;
            t2.next = t1;
            curr = curr.next.next;
        }
        return ans.next;
    }
}