package leetcode.problems.easy.reshape_the_matrix_566;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void matrixReshape() {
        Solution s = new Solution();
        assertArrayEquals(new int[][]{{1, 2, 3, 4}}, s.matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
    }
}