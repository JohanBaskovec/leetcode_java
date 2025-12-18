package leetcode.problems.easy.is_subsequence_392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubsequence() {
        Solution s = new Solution();
        assertTrue(s.isSubsequence("ace", "abcde"));
        assertTrue(s.isSubsequence("a", "abcde"));
        assertTrue(s.isSubsequence("", "abcde"));
        assertFalse(s.isSubsequence("aec", "abcde"));
    }
}