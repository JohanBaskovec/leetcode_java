package leetcode.problems.easy.island_perimeter_463;

@SuppressWarnings("unused")
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int y = 0 ; y < grid.length ; y++) {
            int[] row = grid[y];
            for (int x = 0 ; x < row.length ; x++) {
                if (row[x] == 1) {
                    if (x - 1 >= 0) {
                        if (grid[y][x - 1] == 0) {
                            perimeter++;
                        }
                    } else {
                        perimeter++;
                    }
                    if (x + 1 < row.length) {
                        if (grid[y][x + 1] == 0) {
                            perimeter++;
                        }
                    } else {
                        perimeter++;
                    }
                    if (y - 1 >= 0) {
                        if (grid[y - 1][x] == 0) {
                            perimeter++;
                        }
                    } else {
                        perimeter++;
                    }
                    if (y + 1 < grid.length) {
                        if (grid[y + 1][x] == 0) {
                            perimeter++;
                        }
                    } else {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
