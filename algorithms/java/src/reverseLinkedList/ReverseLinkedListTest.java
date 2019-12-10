package reverseLinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/10
 */
public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    @Before
    public void init() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void reverseList() {
        ListNode listNode = new ListNode(5);
        listNode.next = null;
        ListNode listNode1 = new ListNode(4);
        listNode1.next = listNode;
        ListNode listNode2 = new ListNode(3);
        listNode2.next = listNode1;
        ListNode listNode3 = new ListNode(2);
        listNode3.next = listNode2;
        ListNode listNode4 = new ListNode(1);
        listNode4.next = listNode3;
        ListNode expected = new ListNode(5);
        ListNode next4 = new ListNode(4);
        ListNode next3 = new ListNode(3);
        ListNode next2 = new ListNode(2);
        ListNode next1 = new ListNode(1);
        next2.next = next1;
        next3.next = next2;
        next4.next = next3;
        next1.next = null;
        expected.next = next4;
        assertEquals(expected.toString(), reverseLinkedList.reverseList(listNode4).toString());
    }
}