package leetcode.problems.easy.find_mode_in_binary_search_tree_501;

import leetcode.library.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int count = 0;
    private int maxCount = 0;
    private int prevVal = Integer.MAX_VALUE;
    List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        inOrderTraversal(root);
        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        if (root.val == prevVal) {
            count++;
        } else {
            count = 1;
        }
        if (count > maxCount) {
            maxCount = count;
            result.clear();
            result.add(root.val);
        } else if (count == maxCount) {
            result.add(root.val);
        }
        prevVal = root.val;
        inOrderTraversal(root.right);
    }
}

/*
class Solution {
    private int mostFreq = 0;
    private int[] res = new int[200001];
    private int iRes = 0;
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        findModeDeep(root, 10000000);
        return Arrays.copyOfRange(res, 0, iRes);
    }

    public int findModeDeep(TreeNode root, int lastVal) {
        if (root == null) {
            return 0;
        }
        if (root.val == lastVal) {
            int freq = findModeDeep(root.left, root.val) + findModeDeep(root.right, root.val);
            return 1 + freq;
        } else {
            int freq = 1 + findModeDeep(root.left, root.val) + findModeDeep(root.right, root.val);

            if (freq > mostFreq) {
                mostFreq = freq;
                iRes = 0;
                res[iRes] = root.val;
                iRes = 1;

            } else if (freq == mostFreq) {
                res[iRes] = root.val;
                iRes++;
            }
            return 0;
        }
    }
}
*/
