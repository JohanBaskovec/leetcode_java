package leetcode.problems.easy.subtree_of_another_tree_572;

import leetcode.library.TreeNode;

public class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return deep(root, subRoot);
    }

    private boolean deep(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            boolean isSubRoot = checkIfSubroot(root, subRoot);
            if (isSubRoot) {
                return true;
            }
        }
        return deep(root.left, subRoot) || deep(root.right, subRoot);
    }

    private boolean checkIfSubroot(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (subRoot == null) {
            return false;
        }
        if (root.val != subRoot.val) {
            return false;
        }
        return checkIfSubroot(root.left, subRoot.left) && checkIfSubroot(root.right, subRoot.right);
    }
}
