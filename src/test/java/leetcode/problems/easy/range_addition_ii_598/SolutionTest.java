package leetcode.problems.easy.range_addition_ii_598;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxCount() {
        Solution s = new Solution();
        assertEquals(4, s.maxCount(3, 3, new int[][]{new int[]{2,2},new int[]{3,3}}));
    }
}