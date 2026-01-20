package leetcode.problems.easy.projection_area_of_3d_shapes_883;

public class Solution {
    public int projectionArea(int[][] grid) {
        int xWidth = grid.length;
        int yHeight = grid[0].length;

        int xyArea = 0;
        int xzArea = 0;
        int[] maxY = new int[yHeight];
        for (int x = 0; x < xWidth; x++) {
            int max = 0;
            for (int y = 0; y < yHeight; y++) {
                if (grid[x][y] != 0) {
                    xyArea++;
                    if (grid[x][y] > max) {
                        max = grid[x][y];
                    }
                    if (grid[x][y] > maxY[y]) {
                        maxY[y] = grid[x][y];
                    }
                }
            }
            xzArea+=max;
        }
        int yzArea = 0;
        for (int y = 0; y < yHeight; y++) {
            yzArea+=maxY[y];
        }
        return xyArea + xzArea + yzArea;
    }
}
