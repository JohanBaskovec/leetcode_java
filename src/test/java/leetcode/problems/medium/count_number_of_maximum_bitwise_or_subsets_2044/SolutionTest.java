package leetcode.problems.medium.count_number_of_maximum_bitwise_or_subsets_2044;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countMaxOrSubsets() {
        Solution s = new Solution();
        assertEquals(2, s.countMaxOrSubsets(new int[]{3,1}));
        assertEquals(7, s.countMaxOrSubsets(new int[]{2,2,2}));
        assertEquals(6, s.countMaxOrSubsets(new int[]{3,2,1,5}));
    }
}