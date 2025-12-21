package leetcode.problems.easy.ugly_number_263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isUgly() {
        Solution s = new Solution();
        assertTrue(s.isUgly(1));
        assertTrue(s.isUgly(2));
        assertTrue(s.isUgly(3));
        assertTrue(s.isUgly(4));
        assertTrue(s.isUgly(5));
        assertTrue(s.isUgly(6));
        assertFalse(s.isUgly(7));
        assertTrue(s.isUgly(8));
        assertTrue(s.isUgly(9));
        assertTrue(s.isUgly(10));
        assertFalse(s.isUgly(14));
    }
}