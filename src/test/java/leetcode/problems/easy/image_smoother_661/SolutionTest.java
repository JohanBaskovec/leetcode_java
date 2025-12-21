package leetcode.problems.easy.image_smoother_661;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void imageSmoother() {
        Solution solution = new Solution();
        int[][] res0 = solution.imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}});
        assertArrayEquals(new int[]{137,141,137}, res0[0]);
        assertArrayEquals(new int[]{141,138,141}, res0[1]);
        assertArrayEquals(new int[]{137,141,137}, res0[2]);
    }
}