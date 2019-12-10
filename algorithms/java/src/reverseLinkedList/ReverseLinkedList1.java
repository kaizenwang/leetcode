package reverseLinkedList;

/**
 * @author kaizen
 * @date 2019/12/10
 */
public class ReverseLinkedList1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}
