package leetcode.problems.easy.power_of_four_342;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPowerOfFour() {
        Solution solution = new Solution();
        assertTrue(solution.isPowerOfFour(1));
        assertTrue(solution.isPowerOfFour(4));
        assertTrue(solution.isPowerOfFour(16));
        assertTrue(solution.isPowerOfFour(64));
        assertTrue(solution.isPowerOfFour(256));
        assertTrue(solution.isPowerOfFour(1024));
        assertFalse(solution.isPowerOfFour(0));
        assertFalse(solution.isPowerOfFour(2));
        assertFalse(solution.isPowerOfFour(3));
        assertFalse(solution.isPowerOfFour(5));
        assertFalse(solution.isPowerOfFour(6));
        assertFalse(solution.isPowerOfFour(7));
        assertFalse(solution.isPowerOfFour(8));
        assertFalse(solution.isPowerOfFour(9));
        assertFalse(solution.isPowerOfFour(10));
        assertFalse(solution.isPowerOfFour(20));
        assertFalse(solution.isPowerOfFour(32));
        assertFalse(solution.isPowerOfFour(128));
        assertFalse(solution.isPowerOfFour(40));
    }
}