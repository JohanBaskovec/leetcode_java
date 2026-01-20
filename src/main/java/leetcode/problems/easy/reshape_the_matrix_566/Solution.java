package leetcode.problems.easy.reshape_the_matrix_566;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalWidth = mat[0].length;
        int originalHeight = mat.length;
        if (originalWidth * originalHeight != r * c) {
            return mat;
        }

        int[][] res = new int[r][c];
        int newY = 0;
        int newX = 0;
        for (int y = 0; y < originalHeight; y++) {
            for (int x = 0; x < originalWidth; x++) {
                res[newY][newX] = mat[y][x];
                newX++;
                if (newX == c) {
                    newX = 0;
                    newY++;
                }
            }
        }
        return res;
    }
}
