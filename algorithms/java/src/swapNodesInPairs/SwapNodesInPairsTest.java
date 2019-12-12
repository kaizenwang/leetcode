package swapNodesInPairs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/12
 */
public class SwapNodesInPairsTest {

    private SwapNodesInPairs1 swapNodesInPairs;

    @Before
    public void init() {
        swapNodesInPairs = new SwapNodesInPairs1();
    }

    @Test
    public void swapPairs() {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = listNode3;
        listNode3.next = listNode2;
        listNode2.next = listNode1;
        ListNode expected = new ListNode(2);
        ListNode next3 = new ListNode(4);
        ListNode next2 = new ListNode(3);
        ListNode next1 = new ListNode(1);
        expected.next = next1;
        next1.next = next3;
        next3.next = next2;
        assertEquals(expected.toString(), swapNodesInPairs.swapPairs(head).toString());
    }
}