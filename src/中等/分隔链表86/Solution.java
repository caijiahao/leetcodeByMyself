package 中等.分隔链表86;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode head1 = new ListNode(0), cur1 = head1, head2 = new ListNode(1), cur2 = head2;
        while(head!=null){
            if(head.val>=x){
                cur2.next = head;
                head = head.next;
                cur2 = cur2.next;
                cur2.next = null;
            }else{
                cur1.next = head;
                head = head.next;
                cur1 = cur1.next;
                cur1.next = null;
            }
        }
        cur1.next = head2.next;
        return head1.next;
    }
}
