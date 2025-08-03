package leetcode.problems.medium.max_increase_to_keep_city_skyline_807;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxIncreaseKeepingSkyline() {
        int[][] grid = new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        Solution solution = new Solution();
        int increase = solution.maxIncreaseKeepingSkyline(grid);
        assertEquals(35, increase);
    }
}