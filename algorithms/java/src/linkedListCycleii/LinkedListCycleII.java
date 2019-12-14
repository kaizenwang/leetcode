package linkedListCycleii;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kaizen
 * @date 2019/12/14
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return head;
            } else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
