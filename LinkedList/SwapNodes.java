/*
 * 1721. Swapping Nodes in a Linked List
 */

public class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a = head;
        ListNode b = head;
        ListNode c = head;
        for (int i = 0; i < k - 1; i++) {
            a = a.next;
            c = c.next;
        }
        c = c.next;
        while (c != null) {
            b = b.next;
            c = c.next;
        }
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
        return head;
    }
}
