package leetcode.problems.easy.binary_number_with_alternating_bits_693;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hasAlternatingBits() {
        Solution solution = new Solution();
        assertTrue(solution.hasAlternatingBits(1));
        assertTrue(solution.hasAlternatingBits(2));
        assertTrue(solution.hasAlternatingBits(5));
        assertTrue(solution.hasAlternatingBits(10));
        assertTrue(solution.hasAlternatingBits(21));
        assertTrue(solution.hasAlternatingBits(85));
        assertFalse(solution.hasAlternatingBits(86));
        assertFalse(solution.hasAlternatingBits(3));
        assertFalse(solution.hasAlternatingBits(4));
        assertFalse(solution.hasAlternatingBits(6));
        assertTrue(solution.hasAlternatingBits(715827882));
    }
}