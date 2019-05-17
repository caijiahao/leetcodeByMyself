package 简单.二百零三;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null){
            return null;
        }

        //新建一个头结点
        ListNode h = new ListNode(0);
        ListNode p = h;
        while(head!=null){
            if(head.val!=val){
                p.next = head;
                p = p.next;
            }
            if(head.next!=null){
                head = head.next;
            }else{
                break;
            }
        }

        /*
38        * 这里要特别注意，当最后一个节点是要删除的节点时，
39        * 没有这个判断测试数据不能通过
40        */
        if(p.next!=null){
            p.next = null;
        }

        if(h.next == null){
            return null;
        }else{
            h = h.next;
            return h;
        }
    }
}
