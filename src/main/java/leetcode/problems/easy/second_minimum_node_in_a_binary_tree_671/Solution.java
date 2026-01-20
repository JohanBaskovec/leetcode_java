package leetcode.problems.easy.second_minimum_node_in_a_binary_tree_671;

import leetcode.library.TreeNode;

public class Solution {
    private int secondMinimum = Integer.MAX_VALUE;
    private boolean foundSecondMinimum = false;
    private int firstMinimum = Integer.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        firstMinimum = root.val;
        findSecondMinimumValueDeep(root.left);
        findSecondMinimumValueDeep(root.right);
        if (foundSecondMinimum) {
            return secondMinimum;
        } else {
            return -1;
        }
    }

    private void findSecondMinimumValueDeep(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.val < firstMinimum) {
            int copy = firstMinimum;
            firstMinimum = node.val;
            secondMinimum = copy;
            foundSecondMinimum = true;
        } else if (node.val <= secondMinimum && node.val != firstMinimum) {
            secondMinimum = node.val;
            foundSecondMinimum = true;
        }
        findSecondMinimumValueDeep(node.left);
        findSecondMinimumValueDeep(node.right);
    }

}
