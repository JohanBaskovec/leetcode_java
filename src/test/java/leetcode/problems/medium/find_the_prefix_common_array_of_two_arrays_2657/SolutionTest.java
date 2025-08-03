package leetcode.problems.medium.find_the_prefix_common_array_of_two_arrays_2657;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void findThePrefixCommonArray() {
        Solution solution = new Solution();

        int[] a = new int[]{1,3,2,4};
        int[] b = new int[]{3,1,2,4};
        int[] c = solution.findThePrefixCommonArray(a, b);
        assertArrayEquals(new int[]{0,2,3,4}, c);

        a = new int[]{2,3,1};
        b = new int[]{3,1,2};
        c = solution.findThePrefixCommonArray(a, b);
        assertArrayEquals(new int[]{0,1,3}, c);
    }
}