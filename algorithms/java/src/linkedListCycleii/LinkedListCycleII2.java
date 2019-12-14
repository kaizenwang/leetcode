package linkedListCycleii;

/**
 * @author kaizen
 * @date 2019/12/14
 */
public class LinkedListCycleII2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode s = head;
        ListNode f = head;
        do {
            if (f.next == null || f.next.next == null) {
                return null;
            }
            s = s.next;
            f = f.next.next;
        } while (s != f);
        f = head;
        while (s != f) {
            s = s.next;
            f = f.next;
        }
        return s;
    }
}
