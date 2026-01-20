package leetcode.problems.easy.transpose_matrix_867;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        int width = matrix[0].length;
        int height = matrix.length;
        int[][] res = new int[width][height];

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                res[x][y] = matrix[y][x];
            }
        }
        return res;
    }
}
