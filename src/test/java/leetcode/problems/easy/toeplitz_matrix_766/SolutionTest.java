package leetcode.problems.easy.toeplitz_matrix_766;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isToeplitzMatrix() {
        Solution s = new Solution();
        assertTrue(s.isToeplitzMatrix(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
        assertFalse(s.isToeplitzMatrix(new int[][]{{1,2},{2,2}}));
    }
}