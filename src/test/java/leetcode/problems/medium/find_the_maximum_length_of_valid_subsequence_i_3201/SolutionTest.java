package leetcode.problems.medium.find_the_maximum_length_of_valid_subsequence_i_3201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maximumLength() {
        Solution solution = new Solution();
        assertEquals(4, solution.maximumLength(new int[]{1,2,3,4}));
        assertEquals(6, solution.maximumLength(new int[]{1,2,1,1,2,1,2}));
        assertEquals(2, solution.maximumLength(new int[]{1,3}));
        assertEquals(3, solution.maximumLength(new int[]{4,2,6}));
        assertEquals(4, solution.maximumLength(new int[]{4,1,2,6,3}));
    }
}