package 中等.两两交换链表中的节点24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pivot = dummy;
        ListNode tail = dummy;
        pivot = pivot.next;

        while(pivot!=null){
            ListNode temp = pivot.next;
            if(pivot.next == null){
                break;
            }
            pivot.next = pivot.next.next;
            temp.next = null;
            temp.next = pivot;
            tail.next = temp;
            tail = tail.next.next;
            pivot = pivot.next;
        }
        return dummy.next;
    }
}
