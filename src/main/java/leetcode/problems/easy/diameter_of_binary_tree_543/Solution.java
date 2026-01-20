package leetcode.problems.easy.diameter_of_binary_tree_543;

import leetcode.library.TreeNode;

public class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depthFirst(root);
        return maxDiameter;
    }

    int depthFirst(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depthFirst(root.left);
        int right = depthFirst(root.right);
        int diameter = left + right;
        if (diameter > maxDiameter) {
            maxDiameter = diameter;
        }
        return Math.max(left, right) + 1;
    }
}
