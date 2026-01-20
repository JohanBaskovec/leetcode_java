package leetcode.problems.easy.largest_triangle_area_812;

public class Solution {
    public double largestTriangleArea(int[][] points) {
        double largestArea = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double area = computeArea(points[i], points[j], points[k]);
                    if (area > largestArea) {
                        largestArea = area;
                    }
                }

            }
        }
        return largestArea;
    }

    public double computeArea(int[] one, int[] two, int[] three) {
        // area = |1/2 * (x1(y2-y3) + x2(y3-y1) + x3(y1-y2)|
        int x1 = one[0], y1 = one[1], x2 = two[0], y2 = two[1], x3 = three[0], y3 = three[1];
        return Math.abs(0.5 * ((x1 * (y2 - y3))
                + (x2 * (y3 - y1))
                + (x3 * (y1 - y2))));

    }
}
