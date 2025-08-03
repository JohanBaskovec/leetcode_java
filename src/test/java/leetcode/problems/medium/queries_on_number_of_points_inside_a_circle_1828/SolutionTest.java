package leetcode.problems.medium.queries_on_number_of_points_inside_a_circle_1828;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void countPoints() {
        Solution solution = new Solution();
        int[][] points = new int[][]{{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = new int[][]{{2,3,1},{4,3,1},{1,1,2}};
        int[] nPoints = solution.countPoints(points, queries);
        assertArrayEquals(new int[]{3,2,2}, nPoints);
    }
}