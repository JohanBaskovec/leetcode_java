package leetcode.problems.easy.two_sum_iv_input_is_a_bst_653;

import leetcode.library.TreeNode;

import java.util.HashSet;

public class Solution {
    private final HashSet<Integer> hasInt = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        int rest = k - root.val;
        if (hasInt.contains(rest)) {
            return true;
        }
        hasInt.add(root.val);
        if (findTarget(root.left, k)) {
            return true;
        }
        return findTarget(root.right, k);
    }
/*
    This solution is slower than using a HashSet!
    private boolean[] hasInt = new boolean[200001];
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        int rest = k - root.val;
        if (hasInt[rest + 100000]) {
            return true;
        }
        hasInt[root.val + 100000] = true;
        if (findTarget(root.left, k)) {
            return true;
        }
        if (findTarget(root.right, k)) {
            return true;
        }
        return false;
    }
*/
}
