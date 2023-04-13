/*
 * 21. Merge Two Sorted Lists
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeSortedList {
    // iterative solution
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode list=new ListNode();
        ListNode head=list;
        while(list1!=null || list2!=null){
            if(list1==null){
                list.next=list2;
                break;
            }
            if(list2==null){
                list.next=list1;
                break;
            }
            if(list1.val<list2.val){
                list.next=new ListNode(list1.val,null);
                list1=list1.next;
                list=list.next;
            }
            else{
                list.next=new ListNode(list2.val,null);
                list2=list2.next;
                list=list.next;
            }
        }
        return head.next;
    }
}
