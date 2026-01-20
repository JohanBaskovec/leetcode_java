package leetcode.problems.easy.count_binary_substrings_696;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countBinarySubstrings() {
        Solution s = new Solution();
        assertEquals(1, s.countBinarySubstrings("01"));
        assertEquals(1, s.countBinarySubstrings("011"));
        assertEquals(2, s.countBinarySubstrings("0110"));
        assertEquals(6, s.countBinarySubstrings("00110011"));
    }
}