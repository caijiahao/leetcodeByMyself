package 简单.二百零六;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){  // 空链或只有一个结点，直接返回头指针
            return head;
        }
        else{                                  // 至少有两个结点
            ListNode p1 = head;
            ListNode p2 = p1.next;
            ListNode p3 = p2.next;

            while(p2 == null){                 // 第二个结点为空，到链尾，结束
                p3 = p2.next;
                p2.next = p1;                  // 第二个结点指向第一个结点，进行反转
                p1 = p2;                       // 第一个结点往后移
                p2 = p3;                       // 第二个结点往后移
            }

            head.next = null;                   // 第一个结点也就是反转后的最后一个节点指向 NULL
            head = p1;                          // 头结点指向反转后的第一个节点
            return head;
        }
    }
}
