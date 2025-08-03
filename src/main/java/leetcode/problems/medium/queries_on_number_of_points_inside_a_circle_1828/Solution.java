package leetcode.problems.medium.queries_on_number_of_points_inside_a_circle_1828;

public class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] nPoints = new int[queries.length];
        for (int iQuery = 0 ; iQuery < queries.length ; iQuery++) {
            int[] query = queries[iQuery];
            double queryRadius = query[2] * query[2];
            int count = 0;
            for (int[] point : points) {
                int dx = point[0] - query[0];
                int dy = point[1] - query[1];
                if (dx * dx + dy * dy <= queryRadius) {
                    count++;
                }
            }
            nPoints[iQuery] = count;
        }
        return nPoints;
    }
}
