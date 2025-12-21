package leetcode.problems.easy.repeated_substring_pattern_459;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void repeatedSubstringPattern() {
        Solution s = new Solution();
        assertFalse(s.repeatedSubstringPattern("aba"));
        assertTrue(s.repeatedSubstringPattern("baba"));
        assertTrue(s.repeatedSubstringPattern("abcabcabcabc"));
        assertFalse(s.repeatedSubstringPattern("abcabcabcabcl"));
        assertTrue(s.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabc"));
        assertFalse(s.repeatedSubstringPattern("a"));
        assertTrue(s.repeatedSubstringPattern("aa"));
        assertFalse(s.repeatedSubstringPattern("ab"));
        assertFalse(s.repeatedSubstringPattern("aabaaba"));
        assertTrue(s.repeatedSubstringPattern("aaaabaaaab"));
    }
}