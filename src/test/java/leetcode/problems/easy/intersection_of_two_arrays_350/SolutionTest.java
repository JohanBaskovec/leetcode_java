package leetcode.problems.easy.intersection_of_two_arrays_350;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intersect() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{}, solution.intersect(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{}, solution.intersect(new int[]{2, 3, 4}, new int[]{}));
        assertArrayEquals(new int[]{}, solution.intersect(new int[]{}, new int[]{2, 3, 4}));
        assertArrayEquals(new int[]{2, 2}, solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{2}, solution.intersect(new int[]{1, 2, 1}, new int[]{2, 2}));
    }
}