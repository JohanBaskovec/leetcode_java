package leetcode.problems.easy.path_sum_112;

import leetcode.library.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return getSum(root, targetSum, 0);
    }

    public boolean getSum(TreeNode root, int targetSum, int currentSum) {
        int newSum = currentSum + root.val;
        if (root.left == null && root.right == null) {
            return newSum == targetSum;
        }
        if (root.left != null) {
            boolean leftHasSum = getSum(root.left, targetSum, newSum);
            if (leftHasSum) {
                return true;
            }
        }
        if (root.right != null) {
            return getSum(root.right, targetSum, newSum);
        }
        return false;
    }
}
