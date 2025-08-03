package leetcode.problems.hard.merge_k_sorted_lists_23;

import leetcode.library.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void mergeKLists() {
        Solution solution = new Solution();
        ListNode listNode0 = solution.mergeKLists(new ListNode[]{
                ListNode.fromStringReprensentation("[1,4,5]"),
                ListNode.fromStringReprensentation("[1,3,4]"),
                ListNode.fromStringReprensentation("[2,6]")
        });
        assertEquals(1, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(1, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(2, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(3, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(4, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(4, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(5, listNode0.val);
        listNode0 = listNode0.next;
        assertEquals(6, listNode0.val);
    }
}