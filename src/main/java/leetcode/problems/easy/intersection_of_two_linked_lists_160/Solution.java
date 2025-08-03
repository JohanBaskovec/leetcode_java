package leetcode.problems.easy.intersection_of_two_linked_lists_160;

import leetcode.library.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        if (lengthA > lengthB) {
            int diff = lengthA - lengthB;
            return findIntersection(diff, headB, headA);
        } else {
            int diff = lengthB - lengthA;
            return findIntersection(diff, headA, headB);
        }
    }

    private ListNode findIntersection(int diff, ListNode longerList, ListNode shorterList) {
        while (diff > 0) {
            shorterList = shorterList.next;
            diff--;
        }
        while (longerList != null) {
            if (longerList == shorterList) {
                return longerList;
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }
        return null;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
