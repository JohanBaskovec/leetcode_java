package leetcode.problems.easy.range_addition_ii_598;

public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m * n;
        }
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int[] op : ops) {
            if (op[0] < minX) {
                minX = op[0];
            }
            if (op[1] < minY) {
                minY = op[1];
            }

        }
        return minX * minY;
    }
}
