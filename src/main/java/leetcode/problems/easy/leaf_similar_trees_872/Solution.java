package leetcode.problems.easy.leaf_similar_trees_872;

import leetcode.library.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<TreeNode> leaves = new ArrayList<>();
    int iLeaf = -1;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         getListOfLeaves(root1);

         boolean leavesAreEqual = compareLeaves(root2);
         return leavesAreEqual &&  iLeaf == leaves.size() - 1;
    }

    private void getListOfLeaves(TreeNode root) {
        if (root == null) {
            return;
        }
        getListOfLeaves(root.left);
        if (root.left == null && root.right == null) {
            leaves.add(root);
        }
        getListOfLeaves(root.right);
    }

    private boolean compareLeaves(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!compareLeaves(root.left)) {
            return false;
        }
        if (root.left == null && root.right == null) {
            iLeaf++;
            if (iLeaf > leaves.size() - 1 || root.val != leaves.get(iLeaf).val) {
                return false;
            }
        }
        return compareLeaves(root.right);
    }
}
