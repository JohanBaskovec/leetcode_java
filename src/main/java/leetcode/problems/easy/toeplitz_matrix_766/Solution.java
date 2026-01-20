package leetcode.problems.easy.toeplitz_matrix_766;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int height = matrix.length;
        int width = matrix[0].length;
        for (int y = 1 ; y < height ; y++) {
            for (int x = 1 ; x < width; x++) {
                if (matrix[y][x] != matrix[y - 1][x - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
