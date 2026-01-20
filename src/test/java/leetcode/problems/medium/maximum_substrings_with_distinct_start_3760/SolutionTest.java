package leetcode.problems.medium.maximum_substrings_with_distinct_start_3760;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxDistinct() {
        Solution s = new Solution();
        assertEquals(2, s.maxDistinct("abab"));
        assertEquals(4, s.maxDistinct("abcd"));
    }
}