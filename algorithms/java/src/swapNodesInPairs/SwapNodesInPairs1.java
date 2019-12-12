package swapNodesInPairs;


/**
 * @author kaizen
 * @date 2019/12/12
 */
public class SwapNodesInPairs1 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        return next;
    }
}
