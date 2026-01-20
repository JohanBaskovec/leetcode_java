package leetcode.problems.easy.delete_greatest_value_in_each_row_2500;

import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        for (int x = grid[0].length - 1; x >= 0; x--) {
            int max = grid[0][x];
            for (int y = 1; y < grid.length; y++) {
                if (grid[y][x] > max) {
                    max = grid[y][x];
                }
            }
            ret += max;
        }
        return ret;
    }

}
