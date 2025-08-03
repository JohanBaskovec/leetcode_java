package leetcode.problems.medium.max_increase_to_keep_city_skyline_807;

class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int increase = 0;
        int[] maxHeightPerRow = new int[grid.length];
        int[] maxHeightPerColumn = new int[grid.length];
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid.length; x++) {
                int height = grid[y][x];
                if (maxHeightPerColumn[x] < height) {
                    maxHeightPerColumn[x] = height;
                }
                if (maxHeightPerRow[y] < height) {
                    maxHeightPerRow[y] = height;
                }
            }
        }
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid.length; x++) {
                int min = Math.min(maxHeightPerColumn[x], maxHeightPerRow[y]);
                increase += min - grid[y][x];
            }
        }
        return increase;
    }
}
