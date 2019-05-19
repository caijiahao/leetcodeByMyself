package 中等.删除链表中倒数第n个节点19;



public class Solution {
    ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p = head;
        ListNode q = head;
        for(int i = 0;i<n;i++){
            p = p.next;
        }
        if(p == null){
            head = head.next;
            return head;
        }
        while(p.next!=null){
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }
}
