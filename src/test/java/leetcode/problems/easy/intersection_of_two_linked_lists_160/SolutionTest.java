package leetcode.problems.easy.intersection_of_two_linked_lists_160;

import leetcode.library.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SolutionTest {

    @Test
    void getIntersectionNode() {
        Solution solution = new Solution();
        ListNode listNode0 = ListNode.fromStringReprensentation("[4,1]");
        ListNode listNode1 = ListNode.fromStringReprensentation("[5,6,1]");
        ListNode listNode2 = ListNode.fromStringReprensentation("[8,4,5]");

        assertNotNull(listNode0);
        ListNode listNode0Tail = listNode0.next;
        listNode0Tail.next = listNode2;
        assertNotNull(listNode1);
        ListNode listNode1Tail = listNode1.next.next;
        listNode1Tail.next = listNode2;

        assertEquals(listNode2, solution.getIntersectionNode(listNode0, listNode1));
    }
}