package leetcode.problems.easy.minimum_absolute_difference_in_dst_530;

import leetcode.library.TreeNode;

public class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private boolean foundPrevNum = false;
    private int prevNum = 0;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return minDiff;
    }
    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (foundPrevNum) {
            int diff = root.val - prevNum;
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        prevNum = root.val;
        foundPrevNum = true;

        inOrderTraversal(root.right);
    }
}
