package leetcode.problems.medium.deepest_leaves_sum_1302;

import leetcode.library.TreeNode;

public class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Integer[] depthValues = new Integer[100];
        deepestLeavesSum(root, depthValues, 0);
        for (int i = depthValues.length - 1 ; i >= 0 ; i--) {
            if (depthValues[i] != null) {
                return depthValues[i];
            }
        }
        return 0;
    }

    public void deepestLeavesSum(TreeNode root, Integer[] depthValues, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            Integer currentSum = depthValues[depth];

            int sum = (currentSum == null ? 0 : currentSum) + root.val;
            depthValues[depth] = sum;
        }
        deepestLeavesSum(root.left, depthValues, depth + 1);
        deepestLeavesSum(root.right, depthValues, depth + 1);
    }
}
