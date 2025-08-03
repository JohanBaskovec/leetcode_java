package leetcode.problems.medium.reverse_odd_levels_of_binary_tree_2415;

import leetcode.library.TreeNode;

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        traverseDFS(root.left, root.right, 0);
        return root;
    }

    private void traverseDFS(
            TreeNode leftChild,
            TreeNode rightChild,
            int level
    ) {
        if (leftChild == null || rightChild == null) {
            return;
        }

        if (level % 2 == 0) {
            int temp = leftChild.val;
            leftChild.val = rightChild.val;
            rightChild.val = temp;
        }

        traverseDFS(leftChild.left, rightChild.right, level + 1);
        traverseDFS(leftChild.right, rightChild.left, level + 1);
    }
}
