package leetcode.problems.hard.merge_k_sorted_lists_23;

import leetcode.library.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    void insert(List<ListNode> list, ListNode node) {
        node.next = null;
        int index = Collections.binarySearch(list, node, Comparator.comparingInt(a -> a.val));
        if (index < 0) {
            index = -index - 1;
        }
        int prevIndex = index - 1;
        int nextIndex = index;
        if (prevIndex >= 0) {
            list.get(prevIndex).next = node;
        }
        if (nextIndex < list.size()) {
            node.next = list.get(nextIndex);
        }
        list.add(index, node);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        List<ListNode> nodes = new ArrayList<>(10000);
        for (ListNode list : lists) {
            ListNode current = list;
            while (current != null) {
                ListNode next = current.next;
                insert(nodes, current);
                current = next;
            }
        }
        if (nodes.isEmpty()) {
            return null;
        }
        return nodes.getFirst();


/*
        Solution that uses insertion sort to keep track of the next lowest value
        Arrays.sort(lists, (a, b) -> {
            if (b == null && a == null) {
                return 0;
            } else if (a == null) {
                return Integer.MAX_VALUE;
            } else if (b == null) {
                return Integer.MIN_VALUE;
            }
            return a.val - b.val;
        });
        int nNulls = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                nNulls++;
            }
        }
        int listLength = lists.length - nNulls;
        while (true) {
            if (lists[0] == null) {
                return sortedListHead;
            }
            if (sortedListHead == null) {
                sortedListHead = lists[0];
                sortedListCurrent = sortedListHead;
            } else {
                sortedListCurrent.next = lists[0];
                sortedListCurrent = sortedListCurrent.next;
            }
            ListNode updatedNodeCopy = lists[0].next;
            if (updatedNodeCopy == null) {
                listLength--;
                System.arraycopy(lists, 1, lists, 0, listLength);
                lists[listLength] = null;
            } else {
                int newIndex = Arrays.binarySearch(lists, 1, listLength, updatedNodeCopy, (a, b) -> a.val - b.val);
                if (newIndex < 0) {
                    newIndex = -newIndex - 1;
                }
                System.arraycopy(lists, 1, lists, 0, newIndex - 1);
                lists[newIndex - 1] = updatedNodeCopy;
            }
        }
*/
    }
}
