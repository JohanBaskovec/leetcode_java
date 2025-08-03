package leetcode.library;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static ListNode fromStringReprensentation(String stringRepresentation) {
        Integer[] values = valuesFromStringRepresentation(stringRepresentation);
        if (values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private static Integer[] valuesFromStringRepresentation(String stringRepresentation) {
        String withoutBrackets = stringRepresentation.substring(1, stringRepresentation.length() - 1);
        if (withoutBrackets.isEmpty()) {
            return new Integer[]{};
        }
        String[] strs = withoutBrackets.split(",");
        Integer[] nodeValues = new Integer[strs.length];
        for (int iStr = 0; iStr < strs.length; iStr++) {
            String stringValue = strs[iStr].trim();
            if (stringValue.equals("null")) {
                nodeValues[iStr] = null;
            } else {
                nodeValues[iStr] = Integer.parseInt(stringValue);
            }
        }
        return nodeValues;
    }
}
