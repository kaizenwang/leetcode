package swapNodesInPairs;


/**
 * 两两交换链表中的节点
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @author kaizen
 * @date 2019/12/12
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode s = new ListNode(-1);
        s.next = head;
        ListNode c = s;
        while (c.next != null && c.next.next != null) {
            ListNode a = c.next;
            ListNode b = c.next.next;
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = c.next.next;
        }
        return s.next;
    }
}
