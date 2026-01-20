package leetcode.problems.easy.monotonic_array_896;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isMonotonic() {
        Solution s = new Solution();
        assertTrue(s.isMonotonic(new int[]{1, 2, 3, 4, 5}));
        assertTrue(s.isMonotonic(new int[]{1, 2, 3, 3, 3, 4, 4, 5}));
        assertTrue(s.isMonotonic(new int[]{1, 1, 1, 1, 1, 2, 3, 4, 5}));

        assertFalse(s.isMonotonic(new int[]{1, 2, 1, 4, 5}));
        assertFalse(s.isMonotonic(new int[]{1, 2, 3, 4, 5, 4}));
        assertFalse(s.isMonotonic(new int[]{1, 1, 2, 1, 1, 2, 3, 4, 5}));

        assertTrue(s.isMonotonic(new int[]{5, 4, 3, 2, 1}));
        assertTrue(s.isMonotonic(new int[]{5, 4, 3, 2, 1, 1, 1, 1}));
        assertTrue(s.isMonotonic(new int[]{5, 4, 3, 3, 3, 2, 1, 1, 1, 1}));

        assertFalse(s.isMonotonic(new int[]{5, 4, 3, 3, 4, 2, 1}));

        assertTrue(s.isMonotonic(new int[]{1, 1, 1, 1, 1}));
        assertTrue(s.isMonotonic(new int[]{1}));
    }
}