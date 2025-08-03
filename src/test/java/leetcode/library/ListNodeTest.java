package leetcode.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void fromStringReprensentation() {
        ListNode listNode0 = ListNode.fromStringReprensentation("[]");
        assertNull(listNode0);

        ListNode listNode1 = ListNode.fromStringReprensentation("[0]");
        assertNotNull(listNode1);
        assertEquals(0, listNode1.val);
        assertNull(listNode1.next);

        ListNode listNode2 = ListNode.fromStringReprensentation("[0,1]");
        assertNotNull(listNode2);
        assertEquals(0, listNode2.val);
        listNode2 = listNode2.next;
        assertEquals(1, listNode2.val);
        assertNull(listNode2.next);

        ListNode listNode3 = ListNode.fromStringReprensentation("[0,1,2]");
        assertNotNull(listNode3);
        assertEquals(0, listNode3.val);
        listNode3 = listNode3.next;
        assertEquals(1, listNode3.val);
        listNode3 = listNode3.next;
        assertEquals(2, listNode3.val);
        assertNull(listNode3.next);
    }
}