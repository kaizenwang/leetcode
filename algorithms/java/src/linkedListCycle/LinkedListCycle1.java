package linkedListCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kaizen
 * @date 2019/12/13
 */
public class LinkedListCycle1 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode s = head;
        ListNode f = head.next;
        while (s != f) {
            if (f.next == null || f.next.next == null) {
                return false;
            }
            s = s.next;
            f = f.next.next;
        }
        return true;
    }
}
