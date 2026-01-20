package leetcode.problems.easy.flood_fill_733;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int width = image[0].length;
        int height = image.length;
        boolean[][] visited = new boolean[height][width];
        Queue<int[]> queue = new ArrayDeque<>();
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }
        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int[] next = queue.remove();
            int y = next[0];
            int x = next[1];
            image[y][x] = color;
            for (int visitY = y - 1 ; visitY <= y + 1 ; visitY+=2) {
                if (visitY >= 0 && visitY < height && !visited[visitY][x] && image[visitY][x] == originalColor) {
                    visited[visitY][x] = true;
                    queue.add(new int[]{visitY, x});
                }
            }
            for (int visitX = x - 1 ; visitX <= x + 1 ; visitX+=2) {
                if (visitX >= 0 && visitX < width && !visited[y][visitX] && image[y][visitX] == originalColor) {
                    visited[y][visitX] = true;
                    queue.add(new int[]{y, visitX});
                }
            }
        }

        return image;

    }
}
