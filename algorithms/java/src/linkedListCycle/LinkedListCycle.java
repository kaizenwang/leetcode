package linkedListCycle;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kaizen
 * @date 2019/12/13
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null && head.next != null) {
            if (set.contains(head.next)) {
                return true;
            }
            set.add(head.next);
            head = head.next;
        }
        return false;
    }
}
