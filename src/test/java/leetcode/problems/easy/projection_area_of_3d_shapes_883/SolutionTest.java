package leetcode.problems.easy.projection_area_of_3d_shapes_883;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void projectionArea() {
        Solution s = new Solution();
        assertEquals(17, s.projectionArea(new int[][]{{1,2},{3,4}}));
    }
}