package leetcode.problems.easy.average_of_levels_in_binary_tree_637;

import leetcode.library.TreeNode;

import java.util.*;

class Solution {
    private static class NodeAndLevel {
        int level;
        TreeNode node;
        public NodeAndLevel(int level, TreeNode node) {
            this.level = level;
            this.node = node;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        return findAverages(root);
    }

    public List<Double> findAverages(TreeNode root) {
        List<Double> averages = new ArrayList<>();
        List<TreeNode> parents = new ArrayList<>();
        List<TreeNode> children = new ArrayList<>();
        parents.add(root);
        averages.add((double) root.val);
        long sum = 0;
        double count = 0.0;
        while (true) {
            count = 0;
            sum = 0;
            children = new ArrayList<>();
            for (int i = 0; i < parents.size(); i++) {
                TreeNode parent = parents.get(i);
                if (parent.left != null) {
                    sum = sum + parent.left.val;
                    children.add(parent.left);
                    count++;
                }
                if (parent.right != null) {
                    sum = sum + parent.right.val;
                    children.add(parent.right);
                    count++;
                }
            }
            if (count == 0) {
                break;
            }
            averages.add(sum / count);
            parents = children;
        }
        return averages;
    }
}
