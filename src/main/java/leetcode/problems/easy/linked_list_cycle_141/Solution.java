package leetcode.problems.easy.linked_list_cycle_141;

import leetcode.library.ListNode;

@SuppressWarnings("unused")
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
