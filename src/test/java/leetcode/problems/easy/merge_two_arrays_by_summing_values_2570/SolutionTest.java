package leetcode.problems.easy.merge_two_arrays_by_summing_values_2570;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeArrays() {
        Solution s = new Solution();
        int[][] result0 = s.mergeArrays(new int[][]{{1,2},{2,3},{4,5}}, new int[][]{{1,4},{3,2},{4,1}});
        assertEquals(4, result0.length);
        assertArrayEquals(new int[]{1,6}, result0[0]);
        assertArrayEquals(new int[]{2,3}, result0[1]);
        assertArrayEquals(new int[]{3,2}, result0[2]);
        assertArrayEquals(new int[]{4,6}, result0[3]);
    }
}