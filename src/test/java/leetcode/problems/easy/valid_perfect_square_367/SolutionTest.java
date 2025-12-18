package leetcode.problems.easy.valid_perfect_square_367;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPerfectSquare() {
        Solution s = new Solution();
        assertTrue(s.isPerfectSquare(1));
        assertFalse(s.isPerfectSquare(2));
        assertFalse(s.isPerfectSquare(3));
        assertTrue(s.isPerfectSquare(4));
        assertFalse(s.isPerfectSquare(5));
        assertFalse(s.isPerfectSquare(6));
        assertFalse(s.isPerfectSquare(7));
        assertFalse(s.isPerfectSquare(8));
        assertTrue(s.isPerfectSquare(9));
        assertFalse(s.isPerfectSquare(10));
        assertTrue(s.isPerfectSquare(16));
        assertTrue(s.isPerfectSquare(25));
    }
}