package leetcode.problems.easy.reverse_linked_list_206;

import leetcode.library.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseList() {
        Solution solution = new Solution();
        ListNode listNode0 = ListNode.fromStringReprensentation("[1,2,3,4,5]");
        assertListNodeEqual(ListNode.fromStringReprensentation("[5,4,3,2,1]"), solution.reverseList(listNode0));

        ListNode listNode1 = ListNode.fromStringReprensentation("[1,2]");
        assertListNodeEqual(ListNode.fromStringReprensentation("[2,1]"), solution.reverseList(listNode1));

        ListNode listNode2 = ListNode.fromStringReprensentation("[]");
        assertListNodeEqual(ListNode.fromStringReprensentation("[]"), solution.reverseList(listNode2));
    }

    void assertListNodeEqual(ListNode expected, ListNode actual) {
        if (expected == null) {
            assertNull(actual);
        }
        ListNode currentExpected = expected;
        ListNode currentActual = actual;
        while (currentExpected != null) {
            assertNotNull(currentActual);
            assertEquals(currentExpected.val, currentActual.val);
            currentExpected = currentExpected.next;
            currentActual = currentActual.next;
        }
    }
}