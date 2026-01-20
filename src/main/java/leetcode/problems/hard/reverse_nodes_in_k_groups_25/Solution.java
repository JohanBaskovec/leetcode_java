package leetcode.problems.hard.reverse_nodes_in_k_groups_25;

import leetcode.library.ListNode;

public class Solution {
    // Fast, one-pass solution
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ptr = head;
        ListNode newHead = null;
        ListNode tailOfPrevPrevGroup = null;
        ListNode prev = null;
        int iGroupNode = 0;
        while (true) {
            if (iGroupNode == k) {

            }
            if (ptr == null) {
                break;
            }
            iGroupNode++;
            ListNode next = ptr.next;
            prev = ptr;
            ptr = ptr.next;
        }

        return newHead;
    }
    /*
    Slow, over-complex solution (1ms!!)
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode originalHead = head;
        ListNode newHead = null;
        ListNode lastNodeOfPreviousGroup = null;

        ListNode[] nodesCurrentGroup = new ListNode[k];
        int iCurrentGroup = 0;
        while (true) {
            if (iCurrentGroup == k) {
                iCurrentGroup = 0;
                for  (int i = k - 1; i >= 1 ; i--) {
                    nodesCurrentGroup[i].next = nodesCurrentGroup[i - 1];
                }
                if (lastNodeOfPreviousGroup == null) {
                    newHead = nodesCurrentGroup[k - 1];
                } else {
                    lastNodeOfPreviousGroup.next = nodesCurrentGroup[k - 1];
                }
                lastNodeOfPreviousGroup = nodesCurrentGroup[0];
            }
            if (head == null) {
                break;
            }
            nodesCurrentGroup[iCurrentGroup] = head;
            head = head.next;
            iCurrentGroup++;
        }
        if (lastNodeOfPreviousGroup != null) {
            lastNodeOfPreviousGroup.next = null;
            if (iCurrentGroup != 0) {
                lastNodeOfPreviousGroup.next = nodesCurrentGroup[0];
            }
        }
        if (newHead == null) {
            return originalHead;
        }

        return newHead;
    }
     */
}
