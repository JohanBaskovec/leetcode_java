package leetcode.problems.easy.largest_triangle_area_812;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void largestTriangleArea() {
        assertEquals(2.0, s.largestTriangleArea(new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}}));
        assertEquals(25.5, s.largestTriangleArea(new int[][]{{8,10},{2,7},{9,2},{4,10}}));
    }

    @Test
    void computeArea() {
        assertEquals(25, s.computeArea(new int[]{2,1}, new int[]{8,9}, new int[]{1,8}));
    }
}