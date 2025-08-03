package leetcode.problems.easy.balanced_binary_tree_110;

import leetcode.library.TreeNode;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHeightAndBalanced(root, 0) != -1;
    }

    int getHeightAndBalanced(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth;
        }
        int left = depth;
        int right = depth;
        if (root.left != null) {
            left = getHeightAndBalanced(root.left, depth + 1);
            if (left == -1) {
                return -1;
            }
        }
        if (root.right != null) {
            right = getHeightAndBalanced(root.right, depth + 1);
            if (right == -1) {
                return -1;
            }
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right);
    }
}
