package leetcode.problems.easy.reverse_linked_list_206;

import leetcode.library.ListNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        List<ListNode> values = new ArrayList<>();
        while (current != null) {
            values.add(current);
            current = current.next;
        }
        current = head;

        int mid = values.size() / 2;
        for (int i = values.size() - 1; i >= mid; i--) {
            ListNode right = values.get(i);
            int valCopy = current.val;
            current.val = right.val;
            right.val = valCopy;
            current = current.next;
        }

        return head;
    }
}
