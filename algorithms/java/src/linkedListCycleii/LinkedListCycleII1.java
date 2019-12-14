package linkedListCycleii;

/**
 * @author kaizen
 * @date 2019/12/14
 */
public class LinkedListCycleII1 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }
        ListNode prt1 = head;
        ListNode prt2 = intersect;
        while (prt1 != prt2) {
            prt1 = prt1.next;
            prt2 = prt2.next;
        }
        return prt1;
    }

    private ListNode getIntersect(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                return s;
            }
        }
        return null;
    }
}
