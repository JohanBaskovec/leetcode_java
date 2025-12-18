package leetcode.problems.easy.ransom_note_383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canConstruct() {
        Solution s = new Solution();
        assertTrue(s.canConstruct("", ""));
        assertTrue(s.canConstruct("a", "a"));
        assertTrue(s.canConstruct("ab", "ab"));
        assertFalse(s.canConstruct("abc", "ab"));
        assertTrue(s.canConstruct("abc", "abcccddee"));
    }
}