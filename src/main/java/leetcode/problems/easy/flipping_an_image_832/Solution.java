package leetcode.problems.easy.flipping_an_image_832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] result = new int[rows][cols];
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                result[y][cols - x - 1] = image[y][x] == 1 ? 0 : 1;
            }
        }

        return result;
    }
}
