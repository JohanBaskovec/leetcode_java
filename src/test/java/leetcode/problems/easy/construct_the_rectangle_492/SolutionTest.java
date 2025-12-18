package leetcode.problems.easy.construct_the_rectangle_492;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void constructRectangle() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 2}, solution.constructRectangle(4));
        assertArrayEquals(new int[]{3, 3}, solution.constructRectangle(9));
        assertArrayEquals(new int[]{37, 1}, solution.constructRectangle(37));
        assertArrayEquals(new int[]{427, 286}, solution.constructRectangle(122122));
    }

}