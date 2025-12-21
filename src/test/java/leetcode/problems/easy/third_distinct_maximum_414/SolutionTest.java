package leetcode.problems.easy.third_distinct_maximum_414;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void thirdMax() {
        Solution sol = new Solution();
        assertEquals(1, sol.thirdMax(new int[]{3, 2, 1}));
        assertEquals(2, sol.thirdMax(new int[]{1, 2}));
        assertEquals(1, sol.thirdMax(new int[]{2, 2, 3, 1}));
        assertEquals(Integer.MIN_VALUE, sol.thirdMax(new int[]{2, 2, 1, Integer.MIN_VALUE}));
        assertEquals(2, sol.thirdMax(new int[]{1, 1, 2}));
        assertEquals(2, sol.thirdMax(new int[]{1,2,2,5,3,5}));
        assertEquals(-2147483648, sol.thirdMax(new int[]{1,-2147483648,2}));

    }
}