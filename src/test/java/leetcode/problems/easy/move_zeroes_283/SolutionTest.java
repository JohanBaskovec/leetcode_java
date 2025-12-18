package leetcode.problems.easy.move_zeroes_283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void moveZeroes() {
        Solution solution = new Solution();
        int[] arr0 = new int[]{0,1,0,3,12};
        solution.moveZeroes(arr0);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, arr0);

        int[] arr1 = new int[]{0};
        solution.moveZeroes(arr1);
        assertArrayEquals(new int[]{0}, arr1);

        int[] arr2 = new int[]{1};
        solution.moveZeroes(arr2);
        assertArrayEquals(new int[]{1}, arr2);

        int[] arr3 = new int[]{1,3};
        solution.moveZeroes(arr3);
        assertArrayEquals(new int[]{1,3}, arr3);
    }
}