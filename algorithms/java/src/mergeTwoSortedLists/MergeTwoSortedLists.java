package mergeTwoSortedLists;

/**
 * @author kaizen
 * @date 2019/12/17
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode s = new ListNode(-1);
        ListNode tmp = s;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        tmp.next = l1 != null ? l1 : l2;
        return s.next;
    }
}
