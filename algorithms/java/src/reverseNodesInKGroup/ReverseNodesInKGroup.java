package reverseNodesInKGroup;

/**
 * @author kaizen
 * @date 2019/12/15
 * https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 */
public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode s = new ListNode(-1);
        s.next = head;
        ListNode pre = s;
        ListNode end = s;
        while (s.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return s.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }
}
