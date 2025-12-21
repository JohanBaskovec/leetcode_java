package leetcode.problems.easy.image_smoother_661;

public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] averages = new int[img.length][img[0].length];
        for (int y = 0; y < img.length; y++) {
            for (int x = 0; x < img[0].length; x++) {
                int sum = 0;
                int nCells = 0;
                int minY = Math.max(0, y - 1);
                int minX = Math.max(0, x - 1);
                int maxY = Math.min(img.length - 1, y + 1);
                int maxX = Math.min(img[0].length - 1, x + 1);
                for (int y2 = minY; y2 <= maxY; y2++) {
                    for (int x2 = minX; x2 <= maxX; x2++) {
                        sum += img[y2][x2];
                        nCells++;
                    }
                }
                averages[y][x] = sum / nCells;
            }
        }
        return averages;
    }
}
